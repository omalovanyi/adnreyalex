package com.company.adnreyalex.projects.webshop.dao.javaimpl;

import com.company.adnreyalex.projects.webshop.dao.ProductDao;
import com.company.adnreyalex.projects.webshop.domain.Product;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Repository
public class ProductDaoJavaImpl2 implements ProductDao {

    private Map<String,Product> productsDB= new HashMap<>();

    public ProductDaoJavaImpl2() {

        System.out.println("ProductDaoJavaImpl2 constructor");
    }

    @PostConstruct
    void initDataBase() {

        System.out.println("Init method ProductDaoJavaImpl2");

        Product product1=new Product();
        Product product2=new Product();
        Product product3=new Product();

        product1.setId(1);
        product1.setNameProduct("Samsung");
        product1.setAvailableProduct(1);
        product1.setPrice(100);

        product2.setId(2);
        product2.setNameProduct("Nokia");
        product2.setAvailableProduct(1);
        product2.setPrice(200);

        product3.setId(3);
        product3.setNameProduct("Iphone 7");
        product3.setAvailableProduct(0);
        product3.setPrice(300);

        productsDB.put("Samsung",product1);
        productsDB.put("Nokia",product2);
        productsDB.put("Iphone 7",product3);
    }

    @Override
    public Product getByName(String name) {

        return productsDB.get(name);


    }
}
