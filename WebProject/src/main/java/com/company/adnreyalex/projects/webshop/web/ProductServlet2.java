package com.company.adnreyalex.projects.webshop.web;


import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequestWrapper;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.Enumeration;

/**
 * Created by maoleks on 11/29/2016.
 */
//@Controller
//try use Servlet aqpi 3.1
//@Configurable
public class ProductServlet2 extends HttpServlet {

    // @Autowired
    //ProductService productService;

    public ProductServlet2() {

        System.out.println("Constructor ProductServlet2 created = " + this);
    }

    @Override
    public void init(ServletConfig config) throws ServletException {



        ServletContext servletContext= config.getServletContext();


        System.out.println("name: "+servletContext.getAttribute("name"));
        System.out.println("value: "+servletContext.getAttribute("value"));




    }


    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        HttpSession session=  req.getSession();

        System.out.println(session);

        ServletContext servletContext= session.getServletContext();

        System.out.println("doGet ProductServlet2= " + this);

        //resp.sendRedirect("/count");

        resp.getWriter().write("Hello time = " + servletContext.getAttribute("session"));

    }

}




