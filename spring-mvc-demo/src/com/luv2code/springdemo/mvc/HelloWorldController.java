package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {

	// need a controller to show the initial form
	@RequestMapping("/showForm") 
	public String showForm() {
		return "helloWorld-form";
		 
	 }
	
@RequestMapping("/processForm")
public String processForm() {
	return "HelloWorld";
}
@RequestMapping("/processFormVersionTwo")
public String letsShoutDude(HttpServletRequest request,Model model) {
	
	String theName=request.getParameter("StudentName");
	theName=theName.toUpperCase();
	model.addAttribute("message", theName);
	return "HelloWorld";
	
}



@RequestMapping("/processFormVersionThree")
public String processFormVersionThree(@RequestParam("StudentName") String theName,Model model) {
	
	theName=theName.toUpperCase();
	String result=theName+"sai";
	model.addAttribute("message", result);
	return "HelloWorld";
	
}
	
}
