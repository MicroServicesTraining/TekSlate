/**
 * 
 */
package com.ts.sb.jpa.demo.service;

import java.util.List;

import com.ts.sb.jpa.demo.model.User;

/**
 * @author dorak
 *
 */
public interface UserManagementService {

	List<User> findAllUsers();
	User findUserById(Long id) throws Exception;
	User addNeUser(User user);
	User updateUser(User user) throws Exception;
	String deleteUser(Long id);

}