package com.niit.dbconfiguration;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.niit.dao.ProductDao;
import com.niit.dao.ProductDaoImpl;
import com.niit.model.Product;
@Configuration
@EnableTransactionManagement
@ComponentScan("com.niit")
public class DBConfiguration {
	
	public DBConfiguration()
	{
		System.out.println("DBConfiguration bean is created");
	}
	@Bean ("dataSource")
	public DataSource getDataSource()
	{
	System.out.println("Entering DataSource Bean Creation Method");
	BasicDataSource dataSource=new BasicDataSource();
	System.out.println("hello");
	dataSource.setDriverClassName("org.h2.Driver");
	dataSource.setUrl("jdbc:h2:tcp://localhost/~/New");
	dataSource.setUsername("sasi");
	dataSource.setPassword("sasi");
	System.out.println("DataSource bean " + dataSource);
	return dataSource;	
	}
	@Bean
public SessionFactory sessionFactory()
{
	System.out.println("Entering sessionFactory Creation Method");
	LocalSessionFactoryBuilder lsf=new LocalSessionFactoryBuilder(getDataSource());
	Properties hibernateProperties=new Properties();
	hibernateProperties.setProperty("hibernate.dialect","org.hibernate.dialect.H2Dialect");
	hibernateProperties.setProperty("hibernate.hbm2ddl.auto","update");
	hibernateProperties.setProperty("hibernate.show_sql","true");
	lsf.addProperties(hibernateProperties);
	
	Class classes[]=new Class[]{(Product.class)};
	System.out.println("SessionFactory bean" + lsf);
	return lsf.addAnnotatedClasses(classes).buildSessionFactory();
}
	@Bean
	public HibernateTransactionManager hibTransManagement()
	{
		return new HibernateTransactionManager(sessionFactory());
	}
	
	@Bean
	public ProductDaoImpl getProductDao()
	{
	System.out.println("productdao implementation bean is created");
		
		return new ProductDaoImpl();
	}
}
