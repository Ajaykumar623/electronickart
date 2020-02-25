package com.chinna.Ecommerce.dao;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.chinna.Ecommerce.model.User;
@Component
public class LoginDaoimpl 
{
	@Autowired
SessionFactory sessionFactory;
public void readdata()
{
	System.out.println("sf--"+sessionFactory);
}
public boolean validataUser(User user)
{
	System.out.println(user);
	Session session=sessionFactory.openSession();
	Query query=session.createQuery("from User where userName=:user and  password=:pwd");
	query.setParameter("user",user.getEmail());
	query.setParameter("pwd",user.getPassword());
	Object object=query.uniqueResult();
	User user2=(User)object;
	System.out.println(user2);
	if(user2!=null)
	{
		
		return true;
	}
		else
		{
			return false;
		}
	}
}


