package com.ellisonalves.didemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.ellisonalves.didemo.controllers.ConstructorInjectedController;
import com.ellisonalves.didemo.controllers.MyController;
import com.ellisonalves.didemo.controllers.PropertyInjectedController;
import com.ellisonalves.didemo.controllers.SetterInjectedController;

@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);

		System.out.println(ctx.getBean(MyController.class).sayHello());
		System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
		System.out.println(ctx.getBean(SetterInjectedController.class).sayHello());
		System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
	}
}
