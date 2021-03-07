/**
 * 
 */
package com.ahh.di.lifeCycle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Component;

/**
 * @author adria
 *
 */

@Component
public class LifeCycleBean implements BeanNameAware {

	private static final Logger log = LoggerFactory.getLogger(LifeCycleBean.class);

	@Override
	public void setBeanName(String name) {
		log.info("Name: {}",name);
	}

}
