/**
 * 
 */
package com.ts.sb.sec.demo.config;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author USER
 *
 */
@EnableWebSecurity
public class TSMultiUserSecurityConfigurer extends WebSecurityConfigurerAdapter{

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication()
			.withUser("joseph").password("{noop}123@mm").roles("ADMIN")
			.and()
			.withUser("sekhar").password("{noop}123@mm").roles("USER")
			.and()
			.withUser("ramesh").password("{noop}123@mm").roles("CUSTOMER");		
	}
	
}
