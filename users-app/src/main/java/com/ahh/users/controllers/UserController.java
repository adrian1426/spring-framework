/**
 * 
 */
package com.ahh.users.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ahh.users.models.User;
import com.ahh.users.services.UserService;

/**
 * @author adria
 *
 */

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping
	public ResponseEntity<List<User>> getUsers(){
		return new ResponseEntity<List<User>>(userService.getUsers(),HttpStatus.OK);
	}
	
	@GetMapping("/{username}")
	public ResponseEntity<User> getUserByUsername(@PathVariable String username){
		return new ResponseEntity<User>(userService.getUsersByUsername(username),HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<User> createUser(@RequestBody User user){
		return new ResponseEntity<User>(userService.createUser(user),HttpStatus.CREATED);
	}
	
	@PutMapping("/{username}")
	public ResponseEntity<User> updateUser(@RequestBody User user,@PathVariable String username){
		return new ResponseEntity<User>(userService.updateUser(user, username),HttpStatus.OK);
	}
	
	@DeleteMapping(value=("/{username}"))
	public ResponseEntity<Void> deleteUser(@PathVariable String username){
		userService.deleteUser(username);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}
	
}
