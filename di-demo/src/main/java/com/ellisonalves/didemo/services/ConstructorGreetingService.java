package com.ellisonalves.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements GreetingService {
	
	public static final String INJECTED_BY_THE_CONSTRUCTOR = "Hello - I was injected by the constructor";

	@Override
	public String sayGreeting() {
		return INJECTED_BY_THE_CONSTRUCTOR;
	}

}
