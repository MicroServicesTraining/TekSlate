/**
 * 
 */
package com.ts.sb.demo1.controller;

/**
 * 
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ts.sb.demo1.model.User;
import com.ts.sb.demo1.service.UserManagementService;
import com.ts.sb.demo1.vo.UserVo;

/**
 * @author lolzg
 *
 */

@RestController
@RequestMapping("/users") // http://localhost:8090/users
public class UserManagementController {

	/*private List<String> usersList; // = Arrays.asList("Ravi", "Raju", "Krishna", "Ramesh", "Rahul", "Rajesh");
	*/
	
	@Autowired
	private UserManagementService userManagementService;
	
	/*public UserManagementController() {
		//userManagementService = new UserManagementService();
		usersList = new ArrayList<>();
		usersList.addAll(Arrays.asList("Ravi", "Raju", "Krishna", "Ramesh", "Rahul", "Rajesh"));
	}*/
	
	@RequestMapping(value = "/hello", method = RequestMethod.GET) // http://localhost:8090/users/hello - GET
	public String sayHelloMessage() {
		return "Welcome to Users Management System";
	}
	
	// http://localhost:8090/users/all - GET
	@RequestMapping(value="/all", method = RequestMethod.GET)
	public List<User> findAllUsers() {
		//return usersList;
		return userManagementService.findAllUsers();
		
	}
	
	// http://localhost:8090/users/new - POST
	@RequestMapping(value="/new", method = RequestMethod.POST)
	public ResponseEntity<User> addNewUser(@RequestBody UserVo userVo ) {
		//usersList.add(userVo.getUser());
		return userManagementService.addNewUser(userVo);
		//return "New User Added Successfully";
	}
	
	// http://localhost:8090/users/modify - PUT
	@RequestMapping(value="/modify", method = RequestMethod.PUT)
	public ResponseEntity<Object> modifyUser(@RequestBody UserVo userVo) {
		return userManagementService.modifyUser(userVo);
		//return "User Updated Successfully";
	}
	
	// http://localhost:8090/users/remove - DELETE
	@RequestMapping(value="/remove/{userId}", method = RequestMethod.DELETE)
	public String deleteUser(@PathVariable(name="userId") Long id) {
		return userManagementService.deleteUser(id);
	}
	
	
}

