package com.company.adnreyalex.projects.webshop.service;

import com.company.adnreyalex.projects.webshop.domain.Product;

import java.util.List;

/**
 * Created by Александр on 05.11.2016.
 */
public interface ProductService {

    public Product findProductByName(String nameProduct);

}
