package com.company.adnreyalex.projects.webshop.domain;

/**
 * Created by Александр on 05.11.2016.
 */

public class Product {

    private Integer id;
    private String nameProduct;
    private Integer availableProduct;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public Integer getAvailableProduct() {
        return availableProduct;
    }

    public void setAvailableProduct(Integer availableProduct) {
        this.availableProduct = availableProduct;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", nameProduct='" + nameProduct + '\'' +
                ", availableProduct=" + availableProduct +
                '}';
    }
}
