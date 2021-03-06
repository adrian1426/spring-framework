/**
 * 
 */
package com.ahh.users.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.ahh.users.models.User;
import com.github.javafaker.Faker;

/**
 * @author adria
 *
 */

@Service
public class UserService {

	@Autowired
	private Faker faker;

	private List<User> users = new ArrayList<>();

	@PostConstruct
	public void init() {
		for (int i = 0; i < 100; i++) {
			users.add(new User(faker.funnyName().name(), faker.name().username(), faker.dragonBall().character()));
		}
	}

	public List<User> getUsers(String usernameStartWith) {
		if(usernameStartWith!=null) {
			return users.stream().filter(us->us.getUserName().startsWith(usernameStartWith)).collect(Collectors.toList());
		}
		
		return users;
	}

	public User getUsersByUsername(String username) {
		return users.stream().filter(us -> us.getUserName().equals(username)).findAny()
				.orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,
						String.format("\"User %s No encontrado\"", username)));
	}

	public User createUser(User user) {
		if (users.stream().anyMatch(us -> us.getUserName().equals(user.getUserName()))) {
			throw new ResponseStatusException(HttpStatus.CONFLICT,
					String.format("User %s ya existe", user.getUserName()));
		}

		users.add(user);

		return user;
	}
	
	public User updateUser(User user,String username) {
		User findUserUpdate=getUsersByUsername(username);
		findUserUpdate.setNickName(user.getNickName());
		findUserUpdate.setPassword(user.getPassword());
		
		return findUserUpdate;
	}
	
	public void deleteUser(String username) {
		User findUserDelete=getUsersByUsername(username);
		users.remove(findUserDelete);
	}
}
