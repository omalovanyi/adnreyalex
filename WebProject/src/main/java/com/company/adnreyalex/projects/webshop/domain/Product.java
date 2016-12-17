package com.company.adnreyalex.projects.webshop.domain;

public class Product {

    private Integer id;
    private String nameProduct;
    private boolean availableProduct;
    private double price;

    public Product(Integer id, String nameProduct, boolean availableProduct, Double price) {
        this.id = id;
        this.nameProduct = nameProduct;
        this.availableProduct = availableProduct;
        this.price = price;
    }

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

    public boolean isAvailableProduct() {
        return availableProduct;
    }

    public void setAvailableProduct(boolean availableProduct) {
        this.availableProduct = availableProduct;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", nameProduct='" + nameProduct + '\'' +
                ", availableProduct=" + availableProduct +
                ", price=" + price +
                '}';
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
