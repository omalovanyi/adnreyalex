package com.company.adnreyalex.projects.webshop.web;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletContextListener;

/**
 * Created by Александр on 21.12.2016.
 */
public class MyServletContextListener implements ServletContextListener {

    /**
     * Default constructor.
     */
    public MyServletContextListener() {
    }
    private ServletContext context;
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.out.println("Context Initialized");
        // get servlet context
        context =servletContextEvent.getServletContext();
        // set attribute in context
        String attributeValue = "Context Param Value";
        String attributeName ="ContextParam";
        context.setAttribute(attributeName, attributeValue);
    }
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        System.out.println("Context Destroyed");
    }
}

