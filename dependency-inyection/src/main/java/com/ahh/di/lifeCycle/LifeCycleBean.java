/**
 * 
 */
package com.ahh.di.lifeCycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author adria
 *
 */

@Component
//@Scope("prototype") si está con este scope, no se ejecutará el PreDestroy
public class LifeCycleBean implements BeanNameAware, InitializingBean,DisposableBean {

	private static final Logger log = LoggerFactory.getLogger(LifeCycleBean.class);

	//Se ejecuta durante la construcción de Bean interfaz de BeanNameAware
	@Override
	public void setBeanName(String name) {
		log.info("Bean Name Aware: {}",name);
	}
	
	//Se ejecuta después de la inyección de dependencias
	@PostConstruct
	public void iniciar() {
		log.info("Post Construct");
	}
	
	//Se ejecuta antes de destruir el Bean
	@PreDestroy
	public void destroyBean() {
		log.info("Pre Destroy");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		log.info("After properties set method");
	}

	@Override
	public void destroy() throws Exception {
		log.info("Destroy method");
	}

}
