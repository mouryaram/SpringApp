package com.springdemo.form;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
	@RequestMapping("/")
	public String mainMenu() {
		return "mainMenu";
	}
	@RequestMapping("/showForm")
	public String showForm() {
		return "formDisplay";
	}
	@RequestMapping("/converter")
	public String converter(@RequestParam("DollarCurrencyConverter") String theconv,Model model) {
		float x= Float.parseFloat(theconv);
		x=x/67.258f;
	  String result="The Converted amount in Dollars is : $"+x;
	  model.addAttribute("message", result);
	  return "conversion";
	}
}
