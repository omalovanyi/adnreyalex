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
public class ProductServletC extends HttpServlet {

    // @Autowired
    //ProductService productService;

    public ProductServletC() {

        System.out.println("Constructor ProductServletC created = " + this);
    }



    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        Cookie[] cookies=req.getCookies();

            Cookie cookie=cookies[0];



        System.out.println("doGet ProductServletC = " + this);
        resp.getWriter().write("Hello time = " + cookie.getValue());

    }

}




