package com.example.demo.Day2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ValueAnnotation {
	@Value("${greeting.message}")
	private String message;
	
	@GetMapping("/Value")
	public String getMessage() {
		return message;
	}
}
