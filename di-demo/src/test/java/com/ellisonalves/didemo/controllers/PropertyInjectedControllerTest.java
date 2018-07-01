package com.ellisonalves.didemo.controllers;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.ellisonalves.didemo.DiDemoApplication;
import com.ellisonalves.didemo.services.PropertyGreetingService;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = { DiDemoApplication.class })
public class PropertyInjectedControllerTest {

	@Autowired
	private PropertyInjectedController propertyInjectedController;

	@Test
	public void test() {
		Assert.assertEquals(PropertyGreetingService.INJECTED_BY_PROPERTY, propertyInjectedController.sayHello());
	}

}
