/**
 * 
 */
package com.mm.sb.demo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lolzg
 *
 */

@RestController
@RequestMapping("/users") // http://localhost:8090/users
public class UsersMgmtController {

	@RequestMapping(value = "/hello", method = RequestMethod.GET) // http://localhost:8090/users/hello - GET
	public String getHelloMessage() {
		return "Welcome to Users Management System";
	}
	
	// http://localhost:8090/users/all - GET
	@RequestMapping(value="/all", method = RequestMethod.GET)
	public String getAllUsers() {
		return "All Users list";
	}
	
	// http://localhost:8090/users/new - POST
	@RequestMapping(value="/new", method = RequestMethod.POST)
	public String addNewUser() {
		return "New User Added Successfully";
	}
	
	// http://localhost:8090/users/modify - PUT
	@RequestMapping(value="/modify", method = RequestMethod.PUT)
	public String updateNewUser() {
		return "User Updated Successfully";
	}
	
	// http://localhost:8090/users/remove - DELETE
	@RequestMapping(value="/remove", method = RequestMethod.DELETE)
	public String deleteNewUser() {
		return "User Deleted Successfully";
	}
	
	
}
