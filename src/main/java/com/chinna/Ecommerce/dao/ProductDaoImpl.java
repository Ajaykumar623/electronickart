package com.chinna.Ecommerce.dao;

import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.chinna.Ecommerce.model.Product;
@Component
public class ProductDaoImpl 
{
	@Autowired
	SessionFactory sessionFactory;
	public void InsertProduct(Product product)
	 {
		Session session = sessionFactory.openSession();
		session.save(product);
		Transaction transaction = session.beginTransaction();
		transaction.commit();
		session.close();
	/*
 public List InsertProduct(Product product)
 {
	Session session = sessionFactory.openSession();
	session.save(product);
	Transaction transaction = session.beginTransaction();
	transaction.commit();
	Query query = session.createQuery("from ProductData");
  	 List list = query.list();
	 for(Object object : list)
	 {
		 Product pro =(Product)object;
	 }
	session.close();
	return list;
	*/
 }
	public List getProducts(Product product)
	{
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		Query query = session.createQuery("from Product");
	  	 List list =query.list();
		 for(Object object : list)
		 {
			 Product pro =(Product)object;
		 }
		session.close();
		return list;
	}
	public Product getProduct(int proid)
	{
		Session session = sessionFactory.openSession();
		Query query = session.createQuery("from Product where ProductId=:pid");
		query.setParameter("pid",proid);
		Product product=(Product)query.uniqueResult();
		return product;
		
	}
}
