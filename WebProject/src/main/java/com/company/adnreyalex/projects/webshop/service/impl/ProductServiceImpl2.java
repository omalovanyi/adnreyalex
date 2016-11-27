package com.company.adnreyalex.projects.webshop.service.impl;

import com.company.adnreyalex.projects.webshop.dao.ProductDao;
import com.company.adnreyalex.projects.webshop.domain.Product;
import com.company.adnreyalex.projects.webshop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * Created by Александр on 10.11.2016.
 */
@Service
public class ProductServiceImpl2 implements ProductService {

    @Autowired
    private ProductDao productDao;


    public ProductServiceImpl2() {
        System.out.println("ProductServiceImpl2 constructor");
    }

    @Override
    public Product findProductByName(String nameProduct) {

        Product resultProduct=null;

        Product product=productDao.getByName(nameProduct);

        if (product.getAvailableProduct()==1) {

            resultProduct=product;
        }

        return resultProduct;
    }
}
