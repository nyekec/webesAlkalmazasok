package com.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
public class MainController {
	
	@RequestMapping ("/")
	public String showPage() {
		
		return "main";
	}
	
	@RequestMapping ("/echo")
	public String echo() {
		
		return "echo";
	}
	
	
}