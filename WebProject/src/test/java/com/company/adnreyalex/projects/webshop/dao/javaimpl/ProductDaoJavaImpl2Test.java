package com.company.adnreyalex.projects.webshop.dao.javaimpl;

import com.company.adnreyalex.projects.webshop.dao.ProductDao;
import com.company.adnreyalex.projects.webshop.domain.Product;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Александр on 10.11.2016.
 */
public class ProductDaoJavaImpl2Test {


    List<Product> databaseMock=new ArrayList<>();

    ProductDao productDao;

    @Before
    public void setUp() throws Exception {

        ApplicationContext context= new ClassPathXmlApplicationContext("appContextTest.xml");


        productDao=context.getBean(ProductDao.class);


        Product product1=new Product();
        Product product2=new Product();
        Product product3=new Product();

        product1.setId(1);
        product1.setNameProduct("Samsung");
        product1.setAvailableProduct(1);
        product1.setPrice(100);

        product2.setId(2);
        product2.setNameProduct("Nokia");
        product2.setAvailableProduct(1);
        product2.setPrice(200);

        product3.setId(3);
        product3.setNameProduct("Iphone 7");
        product3.setAvailableProduct(0);
        product3.setPrice(300);

        databaseMock.add(product1);
        databaseMock.add(product2);
        databaseMock.add(product3);

    }
    @Test
    public void getByName() throws Exception {

        Product actualProduct1;
        Product actualProduct2;
        Product actualProduct3;



        actualProduct1 = productDao.getByName("Samsung");
        actualProduct2 = productDao.getByName("Nokia");
        actualProduct3 = productDao.getByName("Iphone 7");

        Assert.assertEquals(actualProduct1,databaseMock.get(0));
        Assert.assertEquals(actualProduct2,databaseMock.get(1));
        Assert.assertEquals(actualProduct3,databaseMock.get(2));

    }


}