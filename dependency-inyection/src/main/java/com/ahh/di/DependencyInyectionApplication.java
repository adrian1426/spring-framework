package com.ahh.di;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ahh.di.aop.TargetObject;

@SpringBootApplication
public class DependencyInyectionApplication {
	
	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(DependencyInyectionApplication.class, args);
		TargetObject targetObject=context.getBean(TargetObject.class);
		targetObject.hello("Hola es mi mensaje");
	}

}
