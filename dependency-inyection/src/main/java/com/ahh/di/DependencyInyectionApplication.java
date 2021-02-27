package com.ahh.di;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ahh.di.qualifiers.Animal;
import com.ahh.di.qualifiers.Avion;
import com.ahh.di.qualifiers.Pajaro;

@SpringBootApplication
public class DependencyInyectionApplication {
	
	private static final Logger log = LoggerFactory.getLogger(DependencyInyectionApplication.class);


	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(DependencyInyectionApplication.class, args);
		Animal animal= context.getBean("pajarito",Animal.class);
		
		log.info("Animal nombre= {}",animal.getNombre());
	}

}
