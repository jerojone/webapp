package com.hcm.springboot.springbootHCM.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AppController {
	
	@RequestMapping(value = "/", method ={ RequestMethod.GET, RequestMethod.POST })
	public String viewHomePage() {
		return "mylogin";
	}
	
	@RequestMapping(value = "/login", method ={ RequestMethod.GET, RequestMethod.POST })
	public String login(Model model, String error, String logout) {
		
		 if (error != null)
	            model.addAttribute("errorMsg", "Your username and password are invalid.");

			/*
			 * if (invalidSession) model.addAttribute("invalidSession",
			 * "Session Expired, Please re-login");
			 */
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

	@RequestMapping(value = "/charts", method ={ RequestMethod.GET, RequestMethod.POST })
	public String charts(Model model) {
		String Pagename="Charts";
		model.addAttribute("page", Pagename);
		
		return "charts1";
		
	}
	}



