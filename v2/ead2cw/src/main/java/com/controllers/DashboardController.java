package com.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DashboardController {
	
	@GetMapping("section1")
	public String addBook() {
		return "addBook";
	}
	
	@GetMapping("section2")
	public String issueBookt() {
		return "issueBook";
	}
	

}
