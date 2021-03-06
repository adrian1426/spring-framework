/**
 * 
 */
package com.ahh.di.autowired;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author adria
 *
 */

@Service
public class AreaCalculatorService {
	
	@Autowired
	private List<Figure> figures;
	
	public double calcAreas() {
		double area=0;
		
		for (Figure figure : figures) {
			area += figure.calculateArea();
		}
		return area;
	}

}
