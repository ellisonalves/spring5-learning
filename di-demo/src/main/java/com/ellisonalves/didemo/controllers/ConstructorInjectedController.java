package com.ellisonalves.didemo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.ellisonalves.didemo.services.GreetingService;

@Controller
public class ConstructorInjectedController {

	public GreetingService greetingService;

	@Autowired
	public ConstructorInjectedController(@Qualifier("constructorGreetingService") GreetingService greetingService) {
		this.greetingService = greetingService;
	}

	public String sayHello() {
		return greetingService.sayGreeting();
	}

}
