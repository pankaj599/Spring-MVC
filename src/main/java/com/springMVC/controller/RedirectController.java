package com.springMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class RedirectController {

	//So here I write 2 handler, I want that after hitting the /one url it will redirect to /blah url
	//then
	@RequestMapping("/one")
	public String one() {
		return "redirect: blah";
	}
	
	@RequestMapping("/blah")
	public String hmm()
	{
		return "contactForm";
	}
	
	// Using RedirectView Class
	//here i will redirect to say google.com
	@RequestMapping("/chalo")
	public RedirectView accha()
	{
		RedirectView r =new RedirectView();
		r.setUrl("https://www.google.com");
		return r;
	}
	
	//@PathVariable("giveId") int id, @PathVariable("giveName") String name
	///{giveId}/{giveName}
	
	//Checking @PathVariable
	@RequestMapping("/kuch/{giveId}/{giveName}")
	public String hand(@PathVariable("giveId") int id, @PathVariable("giveName") String name)
	{
		System.out.println(id+" "+name);
		return "test";
	}
	
	
}
