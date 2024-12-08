package com.ems.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	
	@GetMapping("/home")
	public String HomeControllerHandler() {
		return "This is Home Controller";
	}
	
	@GetMapping("/home1")
	public String HomeControllerHandler1() {
		return "This is Home Controller1";
	}
	
	@GetMapping("/home2")
	public String HomeControllerHandler2() {
		return "This is Home Controller2";
	}

}
