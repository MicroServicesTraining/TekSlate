/**
 * 
 */
package com.ts.sb.jpa.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ts.sb.jpa.demo.model.User;
import com.ts.sb.jpa.demo.service.UserManagementService;


/**
 * @author dorak
 *
 */
@RestController
@RequestMapping("users")
public class UserManagementController {

	@Autowired
	private UserManagementService userManagementService;

	// http://localhost:8090/users/all - GET
	//@RequestMapping(value = "/all", method = RequestMethod.GET)
	@GetMapping
	public List<User> findAllUsers() {
		// return usersList;
		return userManagementService.findAllUsers();

	}
	
	@GetMapping("/{id}")
	public User findUserById(@PathVariable(name = "id") Long userId) throws Exception {
		return userManagementService.findUserById(userId);
	}
	
	@PostMapping
	public User addNewUser(@RequestBody User user) {
		return userManagementService.addNeUser(user);
	}
	
	@PutMapping
	public User updateUser(@RequestBody User user) throws Exception {
		return userManagementService.updateUser(user);
	}
	
	@DeleteMapping("/{id}")
	public String deleteUser(@PathVariable Long id) {
		return userManagementService.deleteUser(id);
	}
}
