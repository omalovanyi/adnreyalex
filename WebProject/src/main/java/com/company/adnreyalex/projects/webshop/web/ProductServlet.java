package com.company.adnreyalex.projects.webshop.web;


import java.io.IOException;

/**
 * Created by maoleks on 11/29/2016.
 */
//@Controller
    //try use Servlet aqpi 3.1
//@Configurable
public class ProductServlet/* extends HttpServlet*/ {

   // @Autowired
    //ProductService productService;

    public ProductServlet() {

        System.out.println("Bean ProductServlet created = "+this);

    }

 /*   @Override
    public void init(ServletConfig config) throws ServletException  {

      //  super.init(config);
       // SpringBeanAutowiringSupport.processInjectionBasedOnCurrentContext(this);
      //  System.out.println("Autowired in Init");
       // System.out.println("Autowired in Init"+productService);
       // System.out.println(config.getServletContext().getMajorVersion());




    }
*/

   /* public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {



        resp.getWriter().write("Hello time = " + System.currentTimeMillis());

       // resp.setContentType("text/html;charset=utf-8");


        //req.getSession();
        //System.out.println("get");




       // PrintWriter out = resp.getWriter();


      //  out.println("<html>");
       // out.println("<body>");
       // out.println("<h1>Hello Servlet Get</h1>");

       // System.out.println(req.getMethod());

        // out.println("<table>");
        //System.out.println("get2");


       // System.out.println(productService.findAllAvailableProduct().toString());
       // System.out.println("get3");
        *//*for (Product product: productService.findAllAvailableProduct()) {

           // System.out.println("get4");

           out.println("<tr>");
           // out.println("<td>");
             out.println("<td>"+product.getNameProduct()+"</td>");
            System.out.println(product.toString());
            //out.println("</td>");

            out.println("<tr>");

        }
*//*
       // System.out.println("get5");
      //  out.println("</table>");

      //  out.println("</body>");
      //  out.println("</html>");

        //out.flush();
       // out.close();



    }
*/

}



