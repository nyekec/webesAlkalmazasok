package com.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FormWZRZNC {
	
	@RequestMapping("/form")
	public String getform() {
		return "form";
	}
	
	@RequestMapping("/submitForm")
	public String submitForm() {
		return "submitted";
	}
	
	@RequestMapping("/getCustomer")
	public String getCustomerData(HttpServletRequest request, Model model) {
		String name = request.getParameter("customerName");
		String result = "Welcome to the website "+name;
		model.addAttribute("message", result);
		return "submitted";
	}
	
}
