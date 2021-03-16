/**
 * 
 */
package com.ts.sb.demo1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.ts.sb.demo1.dao.UserManagementReopository;
import com.ts.sb.demo1.model.User;
import com.ts.sb.demo1.vo.UserVo;

/**
 * @author dorak
 *
 */

@Service
public class UserManagementService {

	@Autowired
	private UserManagementReopository userManagementReopository;

	public List<User> findAllUsers() {
		// business logic
		return userManagementReopository.findAllUsers();
	}

	public ResponseEntity<User> addNewUser(UserVo userVo) {
		User user = convertUserVoToUserEntity(userVo);
		userManagementReopository.addNewUser(user);
		return new ResponseEntity<User>(user, HttpStatus.CREATED);
	//	return "New User Added Successfully";
	}

	private User convertUserVoToUserEntity(UserVo userVo) {
		User user = null;

		if (userVo != null) {
			user = new User();
			user.setUserName(userVo.getuName());
			user.setPassword(userVo.getPwd());
			user.setFirstName(userVo.getfName());
			user.setLastName(userVo.getlName());
			user.setUserId(userVo.getUserId());
		}

		return user;
	}

	public ResponseEntity<Object> modifyUser(UserVo userVo) {
		User user = convertUserVoToUserEntity(userVo);
		boolean isUpdate = userManagementReopository.modifyUser(user);
		if (isUpdate) {
			//return "User Updated Successfully";
			return new ResponseEntity<Object>(user, HttpStatus.OK);
		}else {
			//return "Problem in user updating";
			return new ResponseEntity<Object>("Problem in user updating", HttpStatus.NOT_FOUND);
		}
	}
	
	
	public String deleteUser(Long userId) {
		//User user = convertUserVoToUserEntity(userVo);
		boolean isDeleted = userManagementReopository.deleteUser(userId);
		if (isDeleted) {
			return "User Deleted Successfully";
		}else {
			return "Problem in user Deleting";
		}
	}

}
