/**
 * 
 */
package com.ahh.users.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author adria
 *
 */

@RestController
@RequestMapping("/api")
public class UserController {
	
	@GetMapping
	public String saludo() {
		return "Hola mi amigo";
	}
}
