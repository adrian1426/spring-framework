/**
 * 
 */
package com.ahh.di.atributo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author adria
 *
 */

@Component
public class Motor {
	
	@Value("AHH-M1")
	private String marca;
	
	@Value("1999")
	private Integer modelo;
	
	public Motor() {
	}

	public Motor(String marca, Integer modelo) {
		this.marca = marca;
		this.modelo = modelo;
	}



	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Integer getModelo() {
		return modelo;
	}

	public void setModelo(Integer modelo) {
		this.modelo = modelo;
	}

	@Override
	public String toString() {
		return "Motor [marca=" + marca + ", modelo=" + modelo + "]";
	}

}
