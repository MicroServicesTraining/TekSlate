/**
 * 
 */
package com.ts.sb.jpa.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ts.sb.jpa.demo.model.User;

/**
 * @author dorak
 *
 */
@Repository
public interface UserManagementReopository extends JpaRepository<User, Long> {

}
