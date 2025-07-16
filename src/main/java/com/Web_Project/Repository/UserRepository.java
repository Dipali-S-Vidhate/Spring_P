package com.Web_Project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Web_Project.Entity.User;

public interface UserRepository  extends JpaRepository<User,Integer>

{
	//here user is a entity  and Integer is primary key of entity
	
		public User findByEmailAndPassword(String email,String password);//it a custom finder method ,jpa generate query and login successful
	
}
