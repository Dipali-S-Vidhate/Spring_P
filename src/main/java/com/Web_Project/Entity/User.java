package com.Web_Project.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User 
{
	
	//@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
    int sid;
	 
	 String name;
	 String email;
	 String password;
	
	
	
	
	public int getSid() {
		return sid;
	}


	public void setSid(int sid) {
		this.sid = sid;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return "User [sid=" + sid + ", name=" + name + ", email=" + email + ", password=" + password + "]";
	}


	public User(int sid, String name, String email, String password) {
		super();
		this.sid = sid;
		this.name = name;
		this.email = email;
		this.password = password;
	}


	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

}
