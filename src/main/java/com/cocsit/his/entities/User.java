package com.cocsit.his.entities;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="user_tbl")
public class User {
	
	

	public User( String username, String password, String fname, String lname, String email, String gender,
			String role) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.gender = gender;
		this.role = role;
	}
	
	
	public Integer getId() {
		return id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	

	public void setActive(boolean active) {
		this.active = active;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
	
	
	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public User(String fname, String lname, String email, String gender, String role) {
		super();
		fname = fname;
		lname = lname;
		this.email = email;
		this.gender = gender;
		this.role = role;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public boolean isActive() {
		return active;
	}
	
	
	// columns 
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	
	@Column(name="user_name_col")
	private String username;
	
	@Column(name="user_password_col")
	private String password;	

	@Column(name="usr_status_col")
	private boolean active = false;	
	
	@Column(name="usr_token_col")
	private String token;	
	
	@Column(name="usr_fname_col")
	private String fname;
	
	@Column(name="usr_lname_col")
	private String lname;
	
	@Column(name="usr_email_col")
	private String email;
	
	public Set<Plan> getCreatedPlans() {
		return createdPlans;
	}


	public void setCreatedPlans(Set<Plan> createdPlans) {
		this.createdPlans = createdPlans;
	}


	public Set<Plan> getUpdatedPlans() {
		return updatedPlans;
	}


	public void setUpdatedPlans(Set<Plan> updatedPlans) {
		this.updatedPlans = updatedPlans;
	}


	@Column(name="usr_gender_col")
	private String gender;
	
	@Column(name="usr_role_col")
	private String role;
	
	
	@OneToMany(mappedBy = "createdBy", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Plan> createdPlans;

    @OneToMany(mappedBy = "updatedBy")
    private Set<Plan> updatedPlans;
	
	
	

	
	
	
	
	
	
	
	
	

}
