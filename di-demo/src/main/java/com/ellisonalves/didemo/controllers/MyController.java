package com.ellisonalves.didemo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.ellisonalves.didemo.services.GreetingService;

@Controller
public class MyController {

	private GreetingService greetingService;

	@Autowired
	public MyController(GreetingService greetingService) {
		this.greetingService = greetingService;
	}

	public String sayHello() {
		return greetingService.sayGreeting();
	}

}
