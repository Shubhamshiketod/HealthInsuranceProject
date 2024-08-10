package com.cocsit.his.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cocsit.his.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	
	
	public  List<User> findByRoleIgnoreCase(String role);
	public User findByToken(String token);

}
