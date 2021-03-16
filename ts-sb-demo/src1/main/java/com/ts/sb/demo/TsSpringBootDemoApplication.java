package com.ts.sb.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication = @Config + @ComponentScan + @AutoConfiguration
@SpringBootApplication 
public class TsSpringBootDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TsSpringBootDemoApplication.class, args);
	}

}
