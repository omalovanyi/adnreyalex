package com.company.adnreyalex.projects.webshop.dao;

import com.company.adnreyalex.projects.webshop.domain.Product;

import java.util.List;

public interface ProductDao {

    public Product getByName(String name);

    public List<Product> getListProducts();


}
