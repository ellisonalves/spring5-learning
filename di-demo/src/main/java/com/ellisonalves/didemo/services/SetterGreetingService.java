package com.ellisonalves.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingService implements GreetingService {

	public static final String INJECTED_BY_THE_SETTER = "Hello - I was injected by the setter";

	@Override
	public String sayGreeting() {
		return INJECTED_BY_THE_SETTER;
	}

}
