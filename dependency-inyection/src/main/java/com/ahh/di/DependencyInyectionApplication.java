package com.ahh.di;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.ahh.di.lifeCycle.ExplicitBean;
import com.ahh.di.lifeCycle.LifeCycleBean;

@SpringBootApplication
public class DependencyInyectionApplication {
	
	private static final Logger log = LoggerFactory.getLogger(DependencyInyectionApplication.class);
	
	@Bean
	public String getApplicationName() {
		return "Adrian Dev";
	}
	
//	@Bean(initMethod = "iniciar",destroyMethod = "destroy")
//	public ExplicitBean getBean(){
//		return new ExplicitBean();
//	}

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(DependencyInyectionApplication.class, args);
		LifeCycleBean life=context.getBean(LifeCycleBean.class);
	}

}
