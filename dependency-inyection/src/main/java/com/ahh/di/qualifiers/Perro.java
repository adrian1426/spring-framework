/**
 * 
 */
package com.ahh.di.qualifiers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author adria
 *
 */

@Component
public class Perro extends Animal{

	public Perro(@Value("Chocolate") String nombre,@Value("20") Integer edad) {
		super(nombre, edad);
	}

}
