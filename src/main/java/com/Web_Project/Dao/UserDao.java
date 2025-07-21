package com.Web_Project.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Web_Project.Entity.User;
import com.Web_Project.Repository.UserRepository;


@Repository
public class UserDao {
	
	
	
		@Autowired
		 UserRepository Repo;
			
			public void saveData(User user) 
			{
				Repo.save(user);
			}
	

}
