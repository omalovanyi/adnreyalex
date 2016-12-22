package com.company.adnreyalex.projects.webshop.web;


import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.Enumeration;

/**
 * Created by maoleks on 11/29/2016.
 */
//@Controller
    //try use Servlet aqpi 3.1
//@Configurable
public class ProductServlet extends HttpServlet {

    // @Autowired
    //ProductService productService;

    public ProductServlet() {

        System.out.println("Constructor ProductServlet created = " + this);
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("init ProductServlet created = " + this);
       Enumeration<String> e = config.getInitParameterNames();

        ServletContext servletContext= config.getServletContext();

        String str = "";
        while (e.hasMoreElements()) {
            str = e.nextElement();
            System.out.println("Name: " + str);
            servletContext.setAttribute("name", str);
            System.out.println("Value: " + config.getInitParameter(str));
            servletContext.setAttribute("value", config.getInitParameter(str));
        }







    }


    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Cookie cookie=new Cookie("count","1");
        resp.addCookie(cookie);

         HttpSession session=  req.getSession();
        System.out.println(session);
        ServletContext servletContext= session.getServletContext();

        servletContext.setAttribute("session", session);

        System.out.println("doGet ProductServlet= " + this);

        //RequestDispatcher requestDispatcher =  req.getRequestDispatcher("/hello");

       // System.out.println(requestDispatcher);


       // requestDispatcher.forward(req, resp);


        resp.getWriter().write("Hello time = " + servletContext.getAttribute("session"));

        //req.getRequestDispatcher("productServlet2").forward(req, resp);

        //req.getRequestDispatcher("ProductServlet2").include(req, resp);

    }

}




