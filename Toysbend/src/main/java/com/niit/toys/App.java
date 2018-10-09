package com.niit.toys;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.dao.ProductDao;
import com.niit.dao.ProductDaoImpl;
import com.niit.dbconfiguration.DBConfiguration;
import com.niit.model.Product;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext( DBConfiguration.class,ProductDaoImpl.class);
        //context.scan("com.niit");
        //context.refresh();
        ProductDao productDao=(ProductDao)context.getBean("productDaoImpl");
       
        Product product=new Product();
        product.setProductname("Duck");
		product.setProductdesc("Made in soft cloth materials");
		product.setPrice(200);
		product.setQuantity(80);
		productDao.saveProduct(product);

    }
}
