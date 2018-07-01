package com.ellisonalves.didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile("es")
public class PrimarySpanishGreetingService implements GreetingService {

	@Override
	public String sayGreeting() {
		return "Hola - yo soy el primero bean";
	}

}
