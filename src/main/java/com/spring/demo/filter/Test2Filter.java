package com.spring.demo.filter;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * Created by jie.a.xie on 8/27/2020.
 */
@Component
@WebFilter(urlPatterns = "/*",filterName = "test2Filter")
@Order(2)
public class Test2Filter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("filter222");
        filterChain.doFilter(servletRequest,servletResponse);
    }
}
