package com.cocsit.his.services;

import java.util.List;

import com.cocsit.his.entities.Plan;

public interface IPlanService {
	
	
	    public String savePlan(Plan plan);
	    public String updatePlan(Integer id);
	    public String deletePlan(Integer id);
	    public Plan getOnePlan();
	    public List<Plan> getAllPlan();
	    
	
	
	

}
