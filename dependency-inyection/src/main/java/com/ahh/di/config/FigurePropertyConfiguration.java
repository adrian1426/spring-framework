/**
 * 
 */
package com.ahh.di.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * @author adria
 *
 */

@Configuration
@PropertySource("classpath:areas.properties")
public class FigurePropertyConfiguration {
	
	@Bean
	public PropertySourcesPlaceholderConfigurer getPropertiesConfig() {
		return new PropertySourcesPlaceholderConfigurer();
	}

}
