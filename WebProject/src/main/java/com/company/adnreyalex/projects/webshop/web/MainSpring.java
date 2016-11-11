package com.company.adnreyalex.projects.webshop.web;

import com.company.adnreyalex.projects.webshop.dao.ProductDao;
import com.company.adnreyalex.projects.webshop.domain.Product;
import com.company.adnreyalex.projects.webshop.service.ProductService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Александр on 07.11.2016.
 */
public class MainSpring {

    public static void main(String[] args) {

        ApplicationContext context= new ClassPathXmlApplicationContext("appContext.xml");
        System.out.println(context.getBean(ProductService.class).findProductByName("Iphone 7").toString());


    }

}
