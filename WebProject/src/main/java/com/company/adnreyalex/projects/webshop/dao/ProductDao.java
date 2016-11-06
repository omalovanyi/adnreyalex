package com.company.adnreyalex.projects.webshop.dao;

import com.company.adnreyalex.projects.webshop.domain.Product;

/**
 * Created by Александр on 05.11.2016.
 */
public interface ProductDao {

    public Product getByName(String name);

}
