/**
 * 
 */
package com.ahh.di.autowired;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author adria
 *
 */

@Component
public class Square implements Figure{
	
	@Value("${square.side:1}")
	private double side;

	@Override
	public double calculateArea() {
		return side * side;
	}

}
