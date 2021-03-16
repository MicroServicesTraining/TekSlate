/**
 * 
 */
package com.mm.sb.demo.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mm.sb.demo.vo.UserVo;

/**
 * @author lolzg
 *
 */

@RestController
@RequestMapping("/users") // http://localhost:8090/users
public class UsersMgmtController {

	private List<String> usersList; // = Arrays.asList("Ravi", "Raju", "Krishna", "Ramesh", "Rahul", "Rajesh");
	
	public UsersMgmtController() {
		usersList = new ArrayList<>();
		usersList.addAll(Arrays.asList("Ravi", "Raju", "Krishna", "Ramesh", "Rahul", "Rajesh"));
	}
	
	@RequestMapping(value = "/hello", method = RequestMethod.GET) // http://localhost:8090/users/hello - GET
	public String getHelloMessage() {
		return "Welcome to Users Management System";
	}
	
	// http://localhost:8090/users/all - GET
	@RequestMapping(value="/all", method = RequestMethod.GET)
	public List<String> getAllUsers() {
		return usersList;
	}
	
	// http://localhost:8090/users/new - POST
	@RequestMapping(value="/new", method = RequestMethod.POST)
	public String addNewUser(@RequestBody UserVo userVo ) {
		usersList.add(userVo.getUser());
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
