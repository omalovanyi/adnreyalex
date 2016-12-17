package com.company.adnreyalex.projects.webshop.service.impl;

import com.company.adnreyalex.projects.webshop.dao.ProductDao;
import com.company.adnreyalex.projects.webshop.domain.Product;
import com.company.adnreyalex.projects.webshop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Александр on 10.11.2016.
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;


    public ProductServiceImpl() {
        System.out.println("ProductServiceImpl created");
    }

    @Override
    public List<Product> findAllAvailableProduct() {

        List<Product> listProducts = new ArrayList<>();
//
//        for (Product product : productDao.getListProducts()) {
//            if (product.isAvailableProduct()) {
//                listProducts.add(product);
//            }
//        }
        return productDao.getListProducts().stream().filter(Product::isAvailableProduct).collect(Collectors.toList());
//        return listProducts;
    }

    @Override
    public Product findAvailableProductByName(String name) {
        Product resultProduct = null;
        Product product = productDao.getByName(name);
        if (product.isAvailableProduct()) {

            resultProduct = product;
        }

        return resultProduct;
    }
}
