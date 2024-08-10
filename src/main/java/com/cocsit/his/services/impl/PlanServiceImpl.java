package com.cocsit.his.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cocsit.his.entities.Plan;
import com.cocsit.his.repositories.PlanRepository;
import com.cocsit.his.services.IPlanService;




@Service
public class PlanServiceImpl implements IPlanService{
	
	
	@Autowired
	PlanRepository repo;
	
	
	

	@Override
	public String savePlan(Plan plan) {
		// TODO Auto-generated method stub
		Integer id=repo.save(plan).getPlanId();
		
		
		return null;
	}

	@Override
	public String updatePlan(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deletePlan(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Plan getOnePlan() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Plan> getAllPlan() {
		// TODO Auto-generated method stub
		return null;
	}

}
