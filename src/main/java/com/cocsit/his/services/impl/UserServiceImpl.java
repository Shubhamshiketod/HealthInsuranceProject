package com.cocsit.his.services.impl;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cocsit.his.entities.User;
import com.cocsit.his.repositories.UserRepository;
import com.cocsit.his.services.IUserService;


@Service
public class UserServiceImpl implements IUserService {
	
	
	@Autowired
	UserRepository  repo;
	
	@Autowired
	EmailService emailService;
	
	

	@Override
	public Integer saveUser(User usr) {	
		
	
		System.out.println("Tokern created and added to user ");
		 // Create Token Add To user
		 String tokenId   =UUID.randomUUID().toString();
		 usr.setToken(tokenId);	
	     Integer id= repo.save(usr).getId();
	     
	     System.out.println("*******User saved ***********");
	     System.out.println("*********sending email***********");
	     
	     
	     //Send Email link With Token and when enduser click the link
	     // he should redirect
	     
	     emailService.sendVerificationEmail(usr, tokenId);
	     
	     System.out.println("**********email Sent************");
	     return id;
	     
	}   
	     
	   
	 
	
		


	@Override
	public Integer updateUser(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer deleteUser(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer getOneUser(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAllUser(String role) {
		// TODO Auto-generated method stub
		
		return repo.findByRoleIgnoreCase(role);
	}

	
	
	
	
	public User getUserByToken(String Tokrn) {
		
		
		  return repo.findByToken(Tokrn);
		
		
	}

	@Override
	public Integer saveUsercredential(User usr) {
		// TODO Auto-generated method stub
		return repo.save(usr).getId();	
		 
	}
	
	
	
	
	
	
}
