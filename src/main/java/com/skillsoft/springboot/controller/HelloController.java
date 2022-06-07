package com.skillsoft.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String indexCall() {
		return "Das ist die IndexPage";
	}
	
	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	public String welcome() {
		return "Willkommen zu Spring Boot!";
	}
	
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String hallo() {
		return "Hallo Sasa!";
	}
}
