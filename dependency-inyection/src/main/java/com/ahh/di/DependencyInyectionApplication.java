package com.ahh.di;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DependencyInyectionApplication {
	
	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(DependencyInyectionApplication.class, args);
	}

}
