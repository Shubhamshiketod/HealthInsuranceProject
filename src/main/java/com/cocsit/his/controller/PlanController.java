package com.cocsit.his.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cocsit.his.entities.Plan;

@Controller
@RequestMapping("/plan")
public class PlanController {
	
	

	@GetMapping("/createplan")
	public String createplan(Model model) {
		
		model.addAttribute("plan", new Plan());
		
	     return "newplan";	
		
	}
	
	
	
	@PostMapping("/save")
	public String savePlan(@ModelAttribute("plan") Plan plan ) {
		
		 System.out.println("Saveing plan"+plan.getPlanName());
		
		
		 return "Success";
	}
	
	
	@DeleteMapping("/delete/{id}")
	public String deletePlan( @PathVariable ("id") Integer id) {
		
		
		
		
		
		return null;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
