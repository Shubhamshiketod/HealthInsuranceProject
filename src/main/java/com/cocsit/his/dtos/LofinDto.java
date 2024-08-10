package com.cocsit.his.dtos;

public class LofinDto {
	
	
	private String Username;
	private String password;
	private String confirmPassword;
	public String getUsername() {
		return Username;
	}
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public LofinDto(String username, String password) { 
		super();
		Username = username;
		this.password = password;
	}
	public LofinDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	

}
