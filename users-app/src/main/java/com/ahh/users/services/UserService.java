/**
 * 
 */
package com.ahh.users.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.javafaker.Faker;

/**
 * @author adria
 *
 */

@Service
public class UserService {
	
	@Autowired
	private Faker faker;

}
