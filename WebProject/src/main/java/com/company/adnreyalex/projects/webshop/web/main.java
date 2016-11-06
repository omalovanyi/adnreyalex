package com.company.adnreyalex.projects.webshop.web;

import com.company.adnreyalex.projects.webshop.domain.Product;
import com.company.adnreyalex.projects.webshop.service.ProductService;
import com.company.adnreyalex.projects.webshop.service.impl.ProductServiceImpl;

/**
 * Created by Александр on 05.11.2016.
 */
public class main {

    public static void main(String[] args) {

        ProductService productService=new ProductServiceImpl();

        Product product=productService.findProductByName("Samsung");

        System.out.println(product.toString());


    }
}
