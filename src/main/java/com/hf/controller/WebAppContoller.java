package com.hf.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@ComponentScan
@RestController
public class WebAppContoller {

	private String appMode;

	@Autowired
	public WebAppContoller(Environment environment) {
		appMode = environment.getProperty("app-mode");
	}

	@RequestMapping("/")	
	public String index(Model model) {
		model.addAttribute("datetime", new Date());
		model.addAttribute("username", "ale");
		model.addAttribute("mode", appMode);
		return "index";
	}
	
	

	
}
