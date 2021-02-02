package com.hcm.springboot.springbootHCM.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {
	
	@GetMapping("/")
	public String viewHomePage() {
		return "mylogin";
	}
	

	@GetMapping("/login")
	public String loginPage() {
		return "mylogin";
	}
	
	
	/*
	 * @GetMapping("/logout") public String logout() { return "redirect:/logout"; }
	 */
	 
	//redirect:/logout
	@GetMapping("/index")
	public String homePage() {
		return "index";
	}
	
	@GetMapping("/403")
	public String accessDenied() {
		return "page_403";
	}



}
