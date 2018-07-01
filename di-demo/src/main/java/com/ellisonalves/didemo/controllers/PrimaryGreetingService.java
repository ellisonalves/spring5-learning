package com.ellisonalves.didemo.controllers;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.ellisonalves.didemo.services.GreetingService;

@Service
@Primary
@Profile("en")
public class PrimaryGreetingService implements GreetingService {

	@Override
	public String sayGreeting() {
		return "Hello - I am a primary bean";
	}

}