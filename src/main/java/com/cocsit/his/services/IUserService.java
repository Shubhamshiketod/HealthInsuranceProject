package com.cocsit.his.services;

import java.util.List;

import com.cocsit.his.entities.User;

public interface IUserService {
	
     public Integer  saveUser(User usr);	
     public Integer  updateUser(Integer id);
     public Integer  deleteUser(Integer id);
     public Integer  getOneUser(Integer id);
     public List<User> getAllUser(String role);
     public User getUserByToken(String Tokrn);
     public Integer saveUsercredential(User usr);
	   

}
