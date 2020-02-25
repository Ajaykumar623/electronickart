 package com.chinna.Ecommerce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.chinna.Ecommerce.dao.LoginDaoimpl;
import com.chinna.Ecommerce.model.User;
@Controller
public class LoginController 
{
public ModelAndView LoginController()
{
ModelAndView modelAndView=new ModelAndView("adminhome");
return modelAndView;
}

@RequestMapping("/login")
public ModelAndView login()
{
ModelAndView modelAndView=new ModelAndView("Login");
User user=new User();
user.setUserName("prince");
user.setMobileNo("98658");
modelAndView.addObject("usr",user);
return modelAndView;
}
@Autowired
LoginDaoimpl loginDaoimpl;
@RequestMapping(value="/loginUser",method=RequestMethod.POST)
public String readLogin(@ModelAttribute("usr")User user)
{ 
	String s=null;
	boolean result=loginDaoimpl.validataUser(user);
	// modelAndView=new ModelAndView();
	
	if(result==true)
	{
		System.out.println("-------------------");
		if(user.getRole().equals("ROLE_ADMIN"))
		{
			
		return "adminhome";	
		}
		else if(user.getRole().equals("ROLE_USER"))
		{
			return "userhome";
		}
		
	}
	else if(result==false)
	{
		return "redirect:login";
	}
	else
	{
		return "";
	}
	return "";
}

}
