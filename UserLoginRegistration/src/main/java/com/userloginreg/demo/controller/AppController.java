package com.userloginreg.demo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.userloginreg.demo.model.User;
import com.userloginreg.demo.services.UserService;

@Controller
public class AppController {
	
	@Autowired
	private UserService userService;
	@RequestMapping("/welcome")
	public String Welcome(HttpServletRequest request) {
		return "welcomepage";
	}
	
	@RequestMapping("/register")
	public String registration(HttpServletRequest request) {
		request.setAttribute("mode", "MODE_REGISTER");
		return "welcomepage";
		
	}
	@PostMapping("/save-user")
	public String registerUser(@ModelAttribute User user, BindingResult bindingResult,
			HttpServletRequest request) {
		userService.saveUser(user);
		request.setAttribute("mode", "MODE_HOME");
		return "welcomepage";
		
	}
	
	@GetMapping("/show-users")
	public String showAllUsers(HttpServletRequest request) {
		request.setAttribute("users", userService.showAllUser());
		request.setAttribute("mode", "ALL_USERS");
				return "welcomepage";
	}
}
