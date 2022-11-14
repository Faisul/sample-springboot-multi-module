package com.hr.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hr.user.service.UserService;

@RestController("/")
public class APICheckController {

	@Autowired
	private UserService userService;

	@GetMapping
	public String getTestAPI() {
		return "Alhamdulilah, API is up!\n Welcome " + userService.getUserDetails().getName();
	}

}
