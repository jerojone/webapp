package com.hcm.springboot.springbootHCM.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {
	
	@GetMapping("/")
	public String viewHomePage(Model model, String error, String logout) {
		
		 if (error != null)
	            model.addAttribute("errorMsg", "Your username and password are invalid.");

	        if (logout != null)
	            model.addAttribute("msg", "You have been logged out successfully.");

		return "mylogin";
	}
	

	/*
	 * @GetMapping("/login") public String loginPage() { return "mylogin"; }
	 */
	
	
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
