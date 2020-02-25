package com.chinna.Ecommerce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.chinna.Ecommerce.dao.UserDaoImpl;
import com.chinna.Ecommerce.model.User;

@Component
@Controller
public class HomeController
{
	public ModelAndView HomeController()
	{
		ModelAndView modelAndView=new ModelAndView("adminhome");
		return modelAndView;
	}
	@Autowired
	//UserDaoImpl userdaoimple;
	@RequestMapping("/register")
	public ModelAndView reg()
	{
		ModelAndView modelAndView=new ModelAndView("reg");
		User user=new User();
		user.setMobileNo("99999");
		modelAndView.addObject("usr",user);
		return modelAndView;
	}
	
@Autowired
UserDaoImpl userdaoimpl;
@RequestMapping(value="/carryuser", method=RequestMethod.POST)
	public String readProductForm(@ModelAttribute("usr") User user)
	{
	 /*
		System.out.println(user.getUserName());
		System.out.println(user.getPassword());
		System.out.println(user.getEmail());
		System.out.println(user.getMobileNo());//
		ConnectDB con = new ConnectDB();
		String s1 = user.getUserName();
		String s2= user.getPassword();
		String s3= user.getEmail();
		String s4= user.getMobileNo();
		con.ConnectDataBase(s1,s2,s3,s4);
		*/
	    userdaoimpl.insertUser(user);
		return "adminhome";
	}

}
