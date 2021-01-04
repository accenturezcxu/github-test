package com.spring.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * Created by jie.a.xie on 9/2/2020.
 */
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    private String userName ;

    private String password;

    public void configure(HttpSecurity http) throws Exception {

        http.authorizeRequests().antMatchers("/**").authenticated().and().formLogin().and().logout();
        http.csrf().disable();
    }

    public void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().passwordEncoder(new MyPasswordEncoder()).withUser("test").password("123").roles("USER");
    }

    public class MyPasswordEncoder implements PasswordEncoder{

        @Override
        public String encode(CharSequence charSequence) {
            return charSequence.toString();
        }

        @Override
        public boolean matches(CharSequence charSequence, String s) {
            return s.equals(charSequence.toString());
        }
    }
}
