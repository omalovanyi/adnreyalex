package com.company.adnreyalex.projects.webshop.web;

import com.company.adnreyalex.projects.webshop.dao.ProductDao;
import com.company.adnreyalex.projects.webshop.dao.javaimpl.ProductDaoJavaImpl;
import com.company.adnreyalex.projects.webshop.domain.Product;
import com.company.adnreyalex.projects.webshop.service.ProductService;
import com.company.adnreyalex.projects.webshop.service.impl.ProductServiceImpl;

/**
 * Created by Александр on 05.11.2016.
 */
public class MainJava {

    public static void main(String[] args) {

        ProductDao productDao=new ProductDaoJavaImpl();

        ProductService productService=new ProductServiceImpl(productDao);

        Product product=productService.findProductByName("Samsung");

        System.out.println(product.toString());

    }
}
