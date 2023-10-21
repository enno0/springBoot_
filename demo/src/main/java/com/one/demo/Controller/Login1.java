package com.one.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.one.demo.WhatINeed.CheckValidateUser;

//import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SessionAttributes("UserName")
public class Login1 {
	// CheckValidateUser ch = new CheckValidateUser();
	@Autowired
	CheckValidateUser ch;

	@GetMapping("/Login")
	// @ResponseBody
	public String login() {

		return "/Login";
	}

	@PostMapping("/Login")
	// @ResponseBody
	public String login2(@RequestParam String UserName,
			@RequestParam String Password,

			ModelMap model) {
		// System.out.println(UserName);

		if (ch.CheckValidateUser1(UserName, Password) == true) {
			model.put("UserName", UserName);
			model.put("Password", Password);
			return "/Home";
		} else {
			String error = "invalid Parameters";
			model.put("error", error);

			return "/Login";
		}

	}
}
