package com.tcs.EvaluateProfile.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

@CrossOrigin
@Controller
public class ProfileController {

	@GetMapping("profile")
	public String getData() {
		return "Profile Data";
	}
	
}
