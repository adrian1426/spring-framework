/**
 * 
 */
package com.ahh.di.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author adria
 *
 */

@Aspect
@Component
public class MyAspect {

	private static final Logger log = LoggerFactory.getLogger(MyAspect.class);

	@Before("execution(* com.ahh.di.aop.TargetObject.hello(..))")
	public void before(JoinPoint joingPoint) {
		
		log.info("Method name {} ",joingPoint.getSignature().getName());
		log.info("Before Advice Aquí");
	}
}
