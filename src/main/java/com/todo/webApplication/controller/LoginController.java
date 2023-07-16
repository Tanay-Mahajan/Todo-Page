package com.todo.webApplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.todo.webApplication.service.LoginService;

@Controller
@SessionAttributes("name")
public class LoginController {
	
	@Autowired
	LoginService service;
	
	@RequestMapping(value="/login", method = RequestMethod.GET)
	public String showLoginPage(ModelMap model){
		return "login";
	}

	@RequestMapping(value="/login", method = RequestMethod.POST)
	public String showWelcomePage(ModelMap model, @RequestParam String userName, @RequestParam String password){
		
		boolean isValidUser = service.validateUser(userName, password);
		
		if (!isValidUser) {
			model.put("errorMessage", "Invalid Credentials");
			return "login";
		}
		
		model.put("name", userName);
		model.put("password", password);
		
		return "redirect:/list-todos";
	}

	@RequestMapping(value="/newUserLogin", method = RequestMethod.GET)
	public String showNewLoginPage(ModelMap model){	
		return "newUserLogin";
	}
	
	@RequestMapping(value="/newUserLogin", method = RequestMethod.POST)
	public String showNewLogin(ModelMap model, @RequestParam String userId, @RequestParam String userPassword, 
			@RequestParam String userName, @RequestParam String userEmail,@RequestParam String userContactNo ){
		
		model.put("name", userName);
		model.put("password", userPassword);
		service.insertIntoDb(userId, userPassword, userName, userEmail, userContactNo);
		return "redirect:/login";
	}
	@RequestMapping(value="/logout", method = RequestMethod.GET)
	public String showLogoutPage(ModelMap model){
		return "redirect:/login";
	}
}
