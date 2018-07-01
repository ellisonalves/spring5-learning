package com.ellisonalves.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyGreetingService implements GreetingService {

	public static final String INJECTED_BY_PROPERTY = "Hello - I was injected by property";

	@Override
	public String sayGreeting() {
		return INJECTED_BY_PROPERTY;
	}

}
