package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	
	@GetMapping("/aa")
	public String GetIndex() {
		return "index";
	}
	
	
	@GetMapping("/")
	public String GetMain(){
		return "main";
	}
	
	
	
	
}
