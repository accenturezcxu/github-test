package com.spring.demo.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * Created by jie.a.xie on 8/27/2020.
 */
public class TestFilter implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("filter");

        filterChain.doFilter(servletRequest,servletResponse);

    }

}
