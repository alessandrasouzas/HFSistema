package com.hf.controller;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@ComponentScan
@Controller
public class HomeController {
	
	@RequestMapping(value= {"/home", "/"})
	public String getHomePage() {
		return "home";
	}
	
	
	
}
