package com.example.demoservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	@GetMapping("/")
	public String demo(@RequestParam("string") String test) {
		return "Hello demo!!!!!!!" + test ;
	}
	
}