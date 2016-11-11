package com.company.adnreyalex.projects.webshop.dao;

import com.company.adnreyalex.projects.webshop.domain.Product;

public interface ProductDao {

    public Product getByName(String name);

}
