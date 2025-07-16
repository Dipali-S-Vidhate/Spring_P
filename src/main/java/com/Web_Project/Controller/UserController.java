package com.Web_Project.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Web_Project.Entity.User;
import com.Web_Project.Repository.UserRepository;

@RestController
@RequestMapping("/api")
public class UserController {

	
	@Autowired
	private UserRepository  userRepo;
	
	
	
	//registration or inserting data
	@PostMapping("/Registration")
	public String registration(@RequestBody User user   ) 
	{
		// the save method provided by Jpa to insert data
	   userRepo.save(user);
		return  "user save successfully..";
	}
	
	
@GetMapping("/")
public String welcome()
{
	return "welcome Spring boot by api";
}

//no
@RequestMapping("/getmassege")
public String massage()
{
	return "oh! no..";
}

//no
@PutMapping("/getmassegeee")
public String massageee()
{
	return "oh! no..";
}

//answered
@PatchMapping("/get")
public String get()
{
	return "oh! no..";
}


}
