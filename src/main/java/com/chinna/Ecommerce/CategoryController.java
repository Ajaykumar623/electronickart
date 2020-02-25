package com.chinna.Ecommerce;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class CategoryController 
{

	public CategoryController() 
	{
		System.out.println("Category Controller is loading");
		
	}
		@RequestMapping("/hi")
		public String test()
		{
			System.out.println("at hi request");
			return "hello";
		}

		@RequestMapping("/hlo")
		public String test2()
		{
			System.out.println("at hlo request");
			return "hello";
		}
		@RequestMapping("/products")
		public ModelAndView test3()
		{
			ModelAndView modelAndView=new ModelAndView("Showproducts");
			modelAndView.addObject("chinna",120);
			return modelAndView;
		}
}
