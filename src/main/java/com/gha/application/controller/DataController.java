package com.gha.application.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataController {

	@GetMapping("/")
	public String statusCheck() {
		return "This is working!";
	}

	@GetMapping("/greeting")
	public String greeting() {
		return "Welcome to Github Actions";
	}

}
