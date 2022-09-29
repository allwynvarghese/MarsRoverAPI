package com.nobody.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping("/")
	public String getHomeView(Model model) {
		model.addAttribute("name", "Allwyn");
		model.addAttribute("address", "Wadenbucher Str 19, Boeblingen 71032, Germany");
		return "index";
	}
	
	@GetMapping("/testing")
	public String getTestingView(Model model) {
		model.addAttribute("text", "tetsing page");
		return "index";
	}
}
