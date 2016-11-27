package com.company.adnreyalex.projects.webshop.web;

import com.company.adnreyalex.projects.webshop.dao.ProductDao;
import com.company.adnreyalex.projects.webshop.dao.javaimpl.ProductDaoJavaImpl2;
import com.company.adnreyalex.projects.webshop.domain.Product;
import com.company.adnreyalex.projects.webshop.service.ProductService;
import com.company.adnreyalex.projects.webshop.service.impl.ProductServiceImpl2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Александр on 07.11.2016.
 */
public class MainSpring {

    public static void main(String[] args) {

/*
        ProductDaoJavaImpl2 productDao=new ProductDaoJavaImpl2();

        productDao.initDataBase();

        ProductService productService=new ProductServiceImpl2(productDao);


        System.out.println (productService.findProductByName("Samsung").toString());*/

        ApplicationContext applicationContext= new ClassPathXmlApplicationContext("appContext.xml");

        ProductService productService=applicationContext.getBean(ProductService.class);
        Product product= productService.findProductByName("Samsung");
        System.out.println(product.toString());





        // System.out.println(applicationContext.getBean(ProductService.class).findProductByName("Iphone 7").toString());


    }

}
