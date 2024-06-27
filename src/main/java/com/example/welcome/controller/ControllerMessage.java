package com.example.welcome.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class ControllerMessage {
	
	@GetMapping
	public String getMessage() {
		return "welcome get method";
	}
	@PutMapping
	public String putMessage() {
		return "welcome put method";
	}
	@PostMapping
	public String postMessage() {
		return "welcome post method";
	}
    @DeleteMapping
    public String deleteMessage() {
    	return "welcome delete message";
    }
}
