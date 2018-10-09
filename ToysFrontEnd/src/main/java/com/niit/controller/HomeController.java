package com.niit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String home() {
		return "index";
	}

	@RequestMapping("/about")
	public String about() {
		return "aboutus";
	}

	@RequestMapping("/header")
	public String header() {
		return "header";

	}

	@RequestMapping("/home")
	public String homepage() {
		return "home";

	}
	@RequestMapping("/contactus")
	public String contactus() {
		return "contactus";

	}
	@RequestMapping("/registration")
	public String registration() {
		return "registrationpage";

	}
	@RequestMapping("/footer")
	public String footer() {
		return "footer";

	}
	@RequestMapping("/login")
	public String login() {
		return "loginpage";

	}

}
