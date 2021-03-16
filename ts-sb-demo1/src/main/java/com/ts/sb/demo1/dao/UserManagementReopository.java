/**
 * 
 */
package com.ts.sb.demo1.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.ts.sb.demo1.model.User;

/**
 * @author dorak
 *
 */
@Repository
public class UserManagementReopository {

	private List<User> usersList; // = Arrays.asList("Ravi", "Raju", "Krishna", "Ramesh", "Rahul", "Rajesh");

	public UserManagementReopository() {
		usersList = new ArrayList<>();

		User user1 = new User();
		user1.setUserId(1001L);
		user1.setUserName("ravik");
		user1.setFirstName("Ravi");
		user1.setLastName("Karanam");
		user1.setPassword("123nbs@k");
		usersList.add(user1);

		User user2 = new User();
		user2.setUserId(1002L);
		user2.setUserName("praveenm");
		user2.setFirstName("Praveen");
		user2.setLastName("Matta");
		user2.setPassword("123nbs@k");
		usersList.add(user2);

	}

	/**
	 * @return the usersList
	 */
	public List<User> getUsersList() {
		return usersList;
	}

	/**
	 * @param usersList the usersList to set
	 */
	public void setUsersList(List<User> usersList) {
		this.usersList = usersList;
	}

	public List<User> findAllUsers() {
		return usersList;
	}

	public void addNewUser(User user) {
		usersList.add(user);
	}

	public boolean modifyUser(User user) {
		boolean isUpdated = false;
		boolean userFound = false;
		int index = 0;
		for (User u : usersList) {

			if (user.getUserId().equals(u.getUserId())) {
				userFound = true;
				break;
			}
			index++;
		}
		if (userFound) {
			usersList.remove(index);
			usersList.add(index, user);
			isUpdated = true;
		}

		return isUpdated;

	}

	public boolean deleteUser(Long userId) {
		boolean isDeleted = false;
		boolean userFound = false;
		int index = 0;
		for (User u : usersList) {

			if (userId.equals(u.getUserId())) {
				userFound = true;
				break;
			}
			index++;
		}
		if (userFound) {
			usersList.remove(index);
			isDeleted = true;
		}

		return isDeleted;
	}

}
