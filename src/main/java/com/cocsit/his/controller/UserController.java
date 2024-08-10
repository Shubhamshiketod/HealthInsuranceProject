package com.cocsit.his.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cocsit.his.dtos.LofinDto;
import com.cocsit.his.entities.Plan;
import com.cocsit.his.entities.User;
import com.cocsit.his.services.IUserService;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/User")
public class UserController {



	@Autowired
	IUserService service;
	
	
	@Autowired
	PasswordEncoder passwordEncoder;
	
	
	
	// Load User/Admin Registration Form

	@GetMapping("/loadform")
	public String saveUserForm(Model model) {

		model.addAttribute("user", new User());

		return "register";  
	}
	
	
	

	
	
	
	
	
	
	
	



    // Store User into DB and Send Verification link To email
	@PostMapping("/save")
	public String saveUser(@ModelAttribute User usr,Model model)
	{  
		
		service.saveUser(usr);
		model.addAttribute("message", usr .getFname()+ usr.getLname());
		return "verifyemail";
		
		
	}

	@GetMapping("/verify")
	public String verifyToken(@RequestParam  String token,Model model,HttpSession session) {
	
		model.addAttribute("loginDto",new LofinDto());
		session.setAttribute("token",token);		
		return "login";
		
	}
	
	@PostMapping("/login")	
	public String login(@ModelAttribute LofinDto dto,HttpSession session) {
		
	    String token=(String)session.getAttribute("token") ; 
	    User usr=service.getUserByToken(token);
	  
	    if(usr!=null&& dto.getPassword().equals(dto.getConfirmPassword())) 	
	    {	
	    	usr.setPassword(passwordEncoder.encode(dto.getConfirmPassword()));
	    	usr.setActive(true);
	    	usr.setUsername(dto.getUsername());
	    	usr.setToken(null);
	    	service.saveUsercredential(usr);    	
	   	 
	    }
	    else
	      System.out.println("user not found...");	
	    
	    
	    
	   
	    return "Success";
	} 
	   
	    
	    
	    	
	  	
	   
	   
		       
		
		
		
	
	
	

	@GetMapping("/getAll")
	@ResponseBody
	public List<User> getAllUsers(@RequestParam(value = "role", defaultValue = "caseworker") String role) {
		return service.getAllUser(role);  // Return list of users as JSON
	}






	@GetMapping("/showAll")
	public String showAllPage() {
		return "showall";  // This should match the name of your Thymeleaf template
	}
	
		 
		
		
		
	
	
	
		
		
		
	
		
		
		
		
	

	 

	
	
	
	
	
	








































}
