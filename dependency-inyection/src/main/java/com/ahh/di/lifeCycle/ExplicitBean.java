/**
 * 
 */
package com.ahh.di.lifeCycle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author adria
 *
 */
public class ExplicitBean {

	private static final Logger log = LoggerFactory.getLogger(ExplicitBean.class);

	public void iniciar() {
		log.info("Explicit bean - init method");
	}

	public void destroy() {
		log.info("Explicit bean - destroy method");
	}

}
