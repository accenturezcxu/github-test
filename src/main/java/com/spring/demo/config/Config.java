package com.spring.demo.config;

import com.spring.demo.filter.TestFilter;
import com.spring.demo.interceptor.TestInterceptor;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Created by jie.a.xie on 8/27/2020.
 */
@Configuration
public class Config implements WebMvcConfigurer {

    @Bean
    public FilterRegistrationBean testFilter(){
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        filterRegistrationBean.setFilter(new TestFilter());
        filterRegistrationBean.addUrlPatterns("/*");
        filterRegistrationBean.setOrder(0);
        filterRegistrationBean.setName("testFilter");
        return filterRegistrationBean;
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry){
        registry.addInterceptor(new TestInterceptor()).addPathPatterns("/**");
    }
}
