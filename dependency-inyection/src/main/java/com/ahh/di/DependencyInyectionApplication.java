package com.ahh.di;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.ahh.di.autowired.AreaCalculatorService;

@SpringBootApplication
public class DependencyInyectionApplication {
	
	private static final Logger log = LoggerFactory.getLogger(DependencyInyectionApplication.class);
	
	@Bean
	public String getApplicationName() {
		return "Adrian Dev";
	}


	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(DependencyInyectionApplication.class, args);
		AreaCalculatorService calculatorArea=context.getBean(AreaCalculatorService.class);
		
		log.info("Area total: {}",calculatorArea.calcAreas());
	}

}
