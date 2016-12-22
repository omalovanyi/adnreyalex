package com.company.adnreyalex.projects.webshop.web;


import javax.servlet.*;
import java.io.IOException;

/**
 * Created by maoleks on 12/7/2016.
 */
public class ProductFilterServlet2 implements Filter {

    public ProductFilterServlet2() {

        System.out.println("constructor ProductFilterServlet2");
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("init ProductFilterServlet2");

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        ///add base filter

        System.out.println("before doFilter ProductFilterServlet2=servletRequest");

        filterChain.doFilter(servletRequest,servletResponse);

        System.out.println(" after doFilter ProductFilterServlet2=servletResponse");
    }

    @Override
    public void destroy() {
        System.out.println("destroy ProductFilterServlet2");



    }
}
