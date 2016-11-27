package com.company.adnreyalex.projects.webshop.dao.javaimpl;

import com.company.adnreyalex.projects.webshop.dao.ProductDao;
import com.company.adnreyalex.projects.webshop.domain.Product;
import org.springframework.stereotype.Repository;

/**
 * Created by Александр on 05.11.2016.
 */

public class ProductDaoJavaImpl implements ProductDao {

    public ProductDaoJavaImpl() {

        System.out.println("Constructor ProductDaoJavaImpl");
    }

    public Product getByName(String name) {

        Product product1=new Product();

        product1.setId(1);
        product1.setNameProduct("Samsung");
        product1.setAvailableProduct(1);
        product1.setPrice(100);

        return product1;
    }
}
