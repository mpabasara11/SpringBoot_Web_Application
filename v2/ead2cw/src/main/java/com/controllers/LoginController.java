package com.controllers;



import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class LoginController {
	
	@GetMapping("/")
	public String v1() {
		return "home";
	}
	
	@PostMapping("log")
	public String v2(HttpServletRequest request) throws ServletException   {
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		

		 if((username.equals("admin") && password.equals("pass")))
         {
        
			 return "dash";
         }
     else if(username == null || "".equals(username) || password == null || "".equals(password)){
 		throw new ServletException("Fields Cannot Be Empty!");
 		
 		}
     else{throw new ServletException("Please Check The Details And Try Again!");
     	
     }
		
		
		
		
	}

}
