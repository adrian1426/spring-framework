/**
 * 
 */
package com.ahh.di.lifeCycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author adria
 *
 */

@Component
@Scope("prototype")
public class LifeCycleBean implements BeanNameAware {

	private static final Logger log = LoggerFactory.getLogger(LifeCycleBean.class);

	@Override
	public void setBeanName(String name) {
		log.info("Bean Name Aware: {}",name);
	}
	
	@PostConstruct
	public void iniciar() {
		log.info("Post Construct");
	}
	
	@PreDestroy
	public void destroy() {
		log.info("Pre Destroy");
	}

}
