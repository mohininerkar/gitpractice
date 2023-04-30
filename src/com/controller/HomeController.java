package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.InternalResourceViewResolver;


@Controller
public class HomeController 
{
//InternalResourceViewResolver
//DispatcherServlet
	
	@RequestMapping(value ="/hello")
public ModelAndView hello()
{
System.out.println("hello Method Start");
	System.out.println("hello controller call");
System.out.println("hello Method End");
	return new ModelAndView("success");
}
}

