package com.niit.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.model.Product;





@Repository("productDaoImpl")
@Transactional
public class ProductDaoImpl implements ProductDao{
@Autowired
private SessionFactory sessionfactory;

	public Product saveProduct(Product product){
		Session session=sessionfactory.getCurrentSession();
		System.out.println("Id of the product before persisting" + product.getId());
		session.save(product);
		System.out.println("Id of the product after persistion" + product.getId());
		return product;
}

	/*public Product getProduct(int id) {
		Session session=sessionFactory.getCurrentSession();
		Product product=(Product)session.get(Product.class, id);
		return product;
	}

	public void updateProduct(Product product) {
		Session session=sessionFactory.getCurrentSession();
		session.update(product);
	}

	public Product deleteProduct(int id) {
		Session session=sessionFactory.getCurrentSession();
		Product product=(Product)session.get(Product.class,id);
		session.delete(product);
		return product;
		
	}
*/	
}
