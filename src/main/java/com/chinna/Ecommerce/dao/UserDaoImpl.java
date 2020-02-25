package com.chinna.Ecommerce.dao;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.chinna.Ecommerce.model.User;
@Component
public class UserDaoImpl 
{
	@Autowired
	  SessionFactory sessionFactory;
		 //Configuration configuration ;
	   public void testSessionFactory()
	  {
		System.out.println("sf-----------------"+sessionFactory);
	  }
	   public void insertUser(User user)
	   {
	      //configuration.configure("dbconfig.xml");
	      //configuration.buildSessionFactory();
		   Session session= sessionFactory.openSession();
	   	  session.save(user);
	   	  Transaction transaction=session.beginTransaction();
	   	  transaction.commit();
	   	  session.close();
	   }
}
