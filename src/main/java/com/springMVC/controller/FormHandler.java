package com.springMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.springMVC.User;

@Controller
public class FormHandler {
	
	@RequestMapping(path="/form")
	public String showform()
	{
		return "contactForm";
	}
	
	@RequestMapping(path="/processForm", method=RequestMethod.POST)
	public String process(@RequestParam("TheName") String nm,
			@RequestParam("TheEmail") String em, 
			@RequestParam("ThePassword") String pwd, 
			Model model)
	{
	 //System.out.println(nm+" "+ em+" "+ pwd);
	 model.addAttribute("name",nm);
	 model.addAttribute("email",em);
	 model.addAttribute("password", pwd);
		return "success";
	}
	
	//fetching 2nd form data Method-1
	/*
	 * @RequestMapping(path="/success2", method= RequestMethod.POST) public String
	 * processForm2(@RequestParam("TheName_2") String nm2,
	 * 
	 * @RequestParam("TheEmail_2") String em2, Model mdl) { User u= new
	 * User(nm2,em2); mdl.addAttribute("user", u); return "page2"; }
	 */

		//fetching 2nd form data using modelAttribute
	@RequestMapping(path="/success2", method = RequestMethod.POST)
	public String faram(@ModelAttribute("user") User i,
						Model m)
	{
		return "page2";
	}
}
