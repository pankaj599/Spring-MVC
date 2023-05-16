//This will be our controller class
package com.springMVC.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HomeController {

	@RequestMapping("/home")   //url me /home aayega tab index.jsp page chalega
	public String home(Model model)
	{
		//return the name of the page(name can be anything, here i write index)
		//the page is /WEB-INF/views/index.jsp
		model.addAttribute("name", "pankaj");
		
		List<String> friends=new ArrayList<String>();
		friends.add("abc");
		friends.add("jp");
		friends.add("hmm");
		model.addAttribute("nm", friends);
		return "index";
	}
	
	@RequestMapping("/help")
	public ModelAndView help()
	{
		//creating object of ModelAndView
		ModelAndView m=new ModelAndView();
		
		//adding value to object
		m.addObject("rollno.",56);
		m.addObject("address","meera nagar");
		
		LocalDateTime now=LocalDateTime.now();
		m.addObject("time",now);
		
		
		//setting the page where to send the data
		m.setViewName("help");
		
		return m;
	}
}
