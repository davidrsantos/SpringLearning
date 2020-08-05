package com.santos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

	//need a controller method to show the inicial html form

	@RequestMapping("/showForm")
	public String showForm(){
		return "helloworld-form";
	}

	//need a controller method to process the html from

	public String processForm(){
		return "helloworld";
	}
}
