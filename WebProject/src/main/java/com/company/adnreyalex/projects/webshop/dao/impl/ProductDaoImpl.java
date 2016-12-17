package com.company.adnreyalex.projects.webshop.dao.impl;

import com.company.adnreyalex.projects.webshop.dao.DBConnection;
import com.company.adnreyalex.projects.webshop.dao.ProductDao;
import com.company.adnreyalex.projects.webshop.domain.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductDaoImpl implements ProductDao {

    @Autowired
    private DBConnection dbConnection;

    public ProductDaoImpl() throws ClassNotFoundException {
        System.out.println("Bean ProductDaoImpl created");
        Class.forName("org.hsqldb.jdbcDriver");
    }

    @Override
    public Product getByName(String name) {

        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        Product product = null;

        try {
            conn = dbConnection.getConnection();
            System.out.println("ProductDaoImpl.getByName:" + conn);
            st = conn.createStatement();

            rs = st.executeQuery("select * from PRODUCT where name='" + name + "'");

            while (rs.next()) {

                Integer id = rs.getInt("ID");
                String nameProduct = rs.getString("NAME");
                String flag = rs.getString("FLAG_AVAILABLE");
                Double price = rs.getDouble("PRICE");
                boolean availableProduct = false;

                if ("Y".equals(flag)) {
                    availableProduct = true;
                }

                product = new Product(id, nameProduct, availableProduct, price);

            }


        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null)
                    rs.close();
                if (st != null)
                    st.close();
                if (conn != null)
                    conn.close();

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }


        return product;

    }

    @Override
    public List<Product> getListProducts() {


        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        List<Product> listProducts = new ArrayList<>();


        try {
            conn = dbConnection.getConnection();
            System.out.println("ProductDaoImpl.getListProducts:" + conn);
            st = conn.createStatement();

            rs = st.executeQuery("select * from PRODUCT");

            while (rs.next()) {

                Integer id = rs.getInt("ID");
                String nameProduct = rs.getString("NAME");
                String flag = rs.getString("FLAG_AVAILABLE");
                Double price = rs.getDouble("PRICE");

                boolean availableProduct = false;

                if ("Y".equals(flag)) {
                    availableProduct = true;
                }

                Product product = new Product(id, nameProduct, availableProduct, price);

                listProducts.add(product);

            }


        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null)
                    rs.close();
                if (st != null)
                    st.close();
                if (conn != null)
                    conn.close();

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }


        return listProducts;
    }



}
