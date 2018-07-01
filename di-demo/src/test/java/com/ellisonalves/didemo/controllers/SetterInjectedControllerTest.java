package com.ellisonalves.didemo.controllers;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.ellisonalves.didemo.DiDemoApplication;
import com.ellisonalves.didemo.services.SetterGreetingService;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = { DiDemoApplication.class })
public class SetterInjectedControllerTest {

	@Autowired
	private SetterInjectedController setterInjectedController;

	@Test
	public void test() {
		Assert.assertEquals(SetterGreetingService.INJECTED_BY_THE_SETTER, setterInjectedController.sayHello());
	}

}
