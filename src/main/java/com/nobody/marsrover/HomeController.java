package com.nobody.marsrover;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class HomeController {
	
	@Autowired
	private MarsRoverApiServices roverService;
	
	@GetMapping("/")
	public String getHomeView(Model model) {
		MarsRoverAPIResponse roverData = roverService.getRoverData();
		model.addAttribute("roverData", roverData);
		return "index";
	}
	
	@GetMapping("/testing")
	public String getTestingView(Model model) {
		model.addAttribute("text", "tetsing page");
		return "index";
	}
}
