package com.cocsit.his;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class HisApplication {

	public static void main(String[] args) {
		SpringApplication.run(HisApplication.class, args);
		
		System.out.println("Application Staeted..");
		
		
		
	}

}
