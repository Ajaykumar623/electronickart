package com.chinna.Ecommerce;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.method.support.ModelAndViewContainer;
import org.springframework.web.servlet.ModelAndView;

import com.chinna.Ecommerce.dao.ProductDaoImpl;
import com.chinna.Ecommerce.dao.UserDaoImpl;
import com.chinna.Ecommerce.model.Product;
@Component
@Controller
public class ProductController 
{
	@Autowired
	ProductDaoImpl ProductDaoImpl;
	@Autowired
	
  /*  UserDaoImpl  userDaoimpl;

	@RequestMapping("/showproducts")
	public ModelAndView test3()
	{
	//	userDaoimpl.testSessionFactory();
		System.out.println("at hi request @test3");
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
	    ArrayList arrlst = new ArrayList();
	    arrlst.add(p1);
		arrlst.add(p2);
		arrlst.add(p3);
		p1.setProductId(101);
		p1.setProductName("dell");
		p1.setProductPrice(50000);
		p1.setProductDescription("2gb ram,3000ram");
		p2.setProductId(102);
		p2.setProductName("lenova");
		p2.setProductPrice(48000);
		p2.setProductDescription("3gb ram,3500ram");
		p3.setProductId(103);
		p3.setProductName("HP");
		p3.setProductPrice(46000);
		p3.setProductDescription("4gb ram,4000ram");
		//ModelAndView modelview = new ModelAndView("xyz");
		p1.setProduct(101, "dell", 50000);
		p2.setProduct(102, "lenova", 48000);
		p3.setProduct(103, "HP", 46000);
		ModelAndView modelview = new ModelAndView("displayproducts");
		modelview.addObject("prodata",arrlst);
		return modelview;
	}
*/
@RequestMapping("/adminhome")
public String test()
{
ModelAndView modelview = new ModelAndView("adminhome");
return "adminhome";
}
@Autowired
//ProductDaoImpl productdaoimpl;
@RequestMapping("/addproduct")
public ModelAndView addProduct()
{
Product product  = new Product();
ModelAndView modelview = new ModelAndView("addproducts");
product.setProductName("lenovo");
modelview.addObject("add",product);
/*
Users users = new Users();
users.setEmail("abc@gmail.com");
modelview.addObject("usrs",users);
*/
return modelview;
}
@Autowired
ProductDaoImpl productdaoimpl;
SessionFactory sessionfactory;
@RequestMapping(value="/carryproduct",method=RequestMethod.POST)
public String ProductForm(@ModelAttribute("add") Product product )
{
	System.out.println(product.getProductName());
	System.out.println(product.getProductImage());
/*
System.out.println(product.getProductId());
System.out.println(product.getProductName());
System.out.println(product.getProductPrice());
*/
productdaoimpl.InsertProduct(product);
return "adminhome";
}


@RequestMapping("/showproducts")
public ModelAndView displayProduct()
{
System.out.println("at display product");
Product product = new Product();
List list = productdaoimpl.getProducts(product);
//displayproducts
ModelAndView modelview = new ModelAndView("displayproducts");
modelview.addObject("productList",list);
return modelview;
}
//@RequestMapping("/info") or
@GetMapping("/info")
public ModelAndView getSingleProduct(@RequestParam("pid") int proid)
{
	System.out.println(proid);
	
	Product product=ProductDaoImpl.getProduct(proid);
	
	ModelAndView modelAndView=new ModelAndView("singleproduct");
	modelAndView.addObject("pro",product);
	return modelAndView;
}
}

