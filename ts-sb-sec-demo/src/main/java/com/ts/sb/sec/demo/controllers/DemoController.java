/**
 * 
 */
package com.ts.sb.sec.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author USER
 *
 */
@RestController
@RequestMapping("demo")
public class DemoController {
	
	@GetMapping("hello")
	public String sayHello() {		
		return "<h1>Hello User</h1>";
	}
	
	
}
