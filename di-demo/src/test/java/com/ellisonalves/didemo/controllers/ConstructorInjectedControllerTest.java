package com.ellisonalves.didemo.controllers;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.ellisonalves.didemo.DiDemoApplication;
import com.ellisonalves.didemo.services.ConstructorGreetingService;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = { DiDemoApplication.class })
public class ConstructorInjectedControllerTest {

	@Autowired
	private ConstructorInjectedController constructorInjectedController;

	@Test
	public void testSayHello() {
		Assert.assertEquals(ConstructorGreetingService.INJECTED_BY_THE_CONSTRUCTOR,
				constructorInjectedController.sayHello());
	}

}
