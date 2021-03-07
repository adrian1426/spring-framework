/**
 * 
 */
package com.ahh.di.lazy;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 * @author adria
 *
 */

@Component
@Lazy
public class BeanB {

	private static final Logger log = LoggerFactory.getLogger(BeanB.class);

	@PostConstruct
	public void init() {
		log.info("Inir Bean B");
	}

}
