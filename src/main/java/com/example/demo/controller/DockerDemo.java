package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerDemo {

	@GetMapping("/hello")
	public String hello() {
		return "Welcome to docker";
		
	}
}
