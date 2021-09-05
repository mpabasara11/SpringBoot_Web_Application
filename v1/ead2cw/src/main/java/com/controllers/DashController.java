package com.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DashController {
	
	@GetMapping("section1")
	public String addBook() {
		return "addBook";
	}
	
	@GetMapping("section2")
	public String issueBookt() {
		return "issueBook";
	}
	
	@GetMapping("section3")
	public String issueHistory() {
		return "issueHistory";
	}

	
	@GetMapping("section4")
	public String viewBooklist() {
		return "bookList";
	}

}
