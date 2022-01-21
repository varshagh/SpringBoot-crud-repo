package com.library.student.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class StudentController {
	
     @GetMapping("/getMessage")
	public String getMessage() {
		return "Welcome to the library";
	} 
}
