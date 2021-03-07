/**
 * 
 */
package com.ahh.di.lifeCycle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @author adria
 *
 */

@Component
public class AhhBeanPostPrpcessors implements BeanPostProcessor{
	
	private static final Logger log = LoggerFactory.getLogger(AhhBeanPostPrpcessors.class);

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if(bean instanceof LifeCycleBean) {
			log.info("Antes de inicialización: {}",beanName);
		}
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		
		if(bean instanceof LifeCycleBean) {
			log.info("Después de inicialización: {}",beanName);
		}
		
		return bean;
	}

}
