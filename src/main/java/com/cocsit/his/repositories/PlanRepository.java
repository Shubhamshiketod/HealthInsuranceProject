package com.cocsit.his.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cocsit.his.entities.Plan;

@Repository
public interface PlanRepository extends JpaRepository<Plan, Integer> {

}
