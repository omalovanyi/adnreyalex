package com.company.adnreyalex.projects.webshop.domain;

/**
 * Created by Александр on 05.11.2016.
 */

public class Product {

    private Integer id;
    private String nameProduct;
    private Integer availableProduct;
    private long price;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (getPrice() != product.getPrice()) return false;
        if (!getId().equals(product.getId())) return false;
        if (!getNameProduct().equals(product.getNameProduct())) return false;
        return getAvailableProduct().equals(product.getAvailableProduct());

    }

    @Override
    public int hashCode() {
        int result = getId().hashCode();
        result = 31 * result + getNameProduct().hashCode();
        result = 31 * result + getAvailableProduct().hashCode();
        result = 31 * result + (int) (getPrice() ^ (getPrice() >>> 32));
        return result;
    }

    public long getPrice() {
        return price;
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

    public void setPrice(long price) {
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

    public Integer getAvailableProduct() {
        return availableProduct;
    }

    public void setAvailableProduct(Integer availableProduct) {
        this.availableProduct = availableProduct;
    }

}
