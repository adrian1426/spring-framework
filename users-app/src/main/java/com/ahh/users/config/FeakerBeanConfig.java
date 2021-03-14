/**
 * 
 */
package com.ahh.users.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.github.javafaker.Faker;

/**
 * @author adria
 *
 */

@Configuration
public class FeakerBeanConfig {
	
	@Bean
	public Faker getFaker() {
		return new Faker();
	}

}
