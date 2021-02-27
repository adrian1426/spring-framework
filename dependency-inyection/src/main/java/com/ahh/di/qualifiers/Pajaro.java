/**
 * 
 */
package com.ahh.di.qualifiers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author adria
 *
 */

@Component("pajarito") // el nombre es para el qualifier, sino se le especifica, toma el nombre de la clase
public class Pajaro extends Animal implements Volador{
	private static final Logger log = LoggerFactory.getLogger(Pajaro.class);
	
	public Pajaro(@Value("pájaro loco") String nombre,@Value("12") Integer edad) {
		super(nombre, edad);
	}


	@Override
	public void volar() {
		log.info("Soy un ave,estoy volando amigo");
	}

}
