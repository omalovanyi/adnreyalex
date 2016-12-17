package com.company.adnreyalex.projects.webshop;

import com.company.adnreyalex.projects.webshop.dao.ProductDao;
import com.company.adnreyalex.projects.webshop.service.ProductService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainSpring {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("appContext.xml");

        ProductDao product=applicationContext.getBean(ProductDao.class);

       // System.out.println(product.getByName("Samsung"));
       // System.out.println(product.getListProducts());


        ProductService service=applicationContext.getBean(ProductService.class);


        System.out.println(service.findAvailableProductByName("Samsung"));
        //System.out.println(service.findAllAvailableProduct());

       // System.out.println(service.findAvailableProductByName("6"));
       // System.out.println(service.findAvailableProductByName("iphone7"));


    }

}
