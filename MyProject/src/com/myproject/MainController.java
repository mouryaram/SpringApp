package com.myproject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	@RequestMapping("/")
	public String form() {
		return "main-menu";
	}
	@RequestMapping("/showForm")
	public String showForm(Model model) {
	model.addAttribute("signUpPage", new SignUpPage());
		return "signupform";
	}
@RequestMapping("/confirmationPage")
	public String confirmationPage(@ModelAttribute("signUpPage") SignUpPage signUpPage ) {
		return "member-confirmation";
}

}
