package com.company.adnreyalex.projects.webshop.service.impl;

import com.company.adnreyalex.projects.webshop.dao.ProductDao;
import com.company.adnreyalex.projects.webshop.domain.Product;
import com.company.adnreyalex.projects.webshop.service.ProductService;

import java.util.List;

/**
 * Created by Александр on 05.11.2016.
 */
public class ProductServiceImpl implements ProductService {

private ProductDao productDao;

    public ProductServiceImpl(ProductDao productDao) {

        System.out.println("Constructor ProductServiceImpl");

        this.productDao = productDao;
    }

    public ProductDao getProductDao() {
        return productDao;
    }

    public void setProductDao(ProductDao productDao) {
        this.productDao = productDao;
    }

    public ProductServiceImpl() {
        System.out.println("Constructor ProductServiceImpl");

    }

    public Product findProductByName(String nameProduct) {

        return productDao.getByName(nameProduct);

    }


}
