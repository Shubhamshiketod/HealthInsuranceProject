package com.cocsit.his.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.cocsit.his.entities.User;

@Service
public class EmailService {
	
	
	@Autowired
	private JavaMailSender mailSender;
	
	
	 public void sendVerificationEmail(User user, String dummyPassword) {
	        String url = "http://localhost:8080/User/verify?token=" + user.getToken();
	        SimpleMailMessage message = new SimpleMailMessage();
	        message.setTo(user.getEmail());
	        message.setSubject("Complete Your Registration");
	        message.setText("Your account has been created with a temporary password: " + dummyPassword +
	                ". Click the link to complete your registration and set your username and a new password: " + url);
	        mailSender.send(message);
	    }
	
	
	
	

}
