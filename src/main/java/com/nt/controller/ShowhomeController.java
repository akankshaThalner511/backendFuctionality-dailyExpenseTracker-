package com.nt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ShowhomeController {

	@RequestMapping("/home")
	public String showHomePage() {
		//return
		return "welcome";
	}
	
	
}
