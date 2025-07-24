package com.Web_Project.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.Web_Project.Dao.UserDao;
import com.Web_Project.Entity.User;
import com.Web_Project.Repository.UserRepository;


@RestController
@RequestMapping("/api")
public class UserController {

	
	@Autowired
	 UserRepository  userRepo;
	
	@Autowired
	UserDao userDao ;
	
	
	
	//registration or inserting data
	@PostMapping("/Registration")
	public String registration(@RequestBody User user   ) 
	{
		// the save method provided by Jpa to insert data
	   userRepo.save(user);
	return  "user save successfully..";
	}
	
	
	
	
	//This annotation maps an HTTP request to a handler method.{sid} is a path variable 
		@RequestMapping("/getUserById/{sid}")
		public ResponseEntity<User> getUserById(@PathVariable int sid) //ResponseEntity<Student> is a flexible HTTP response wrapper.
		{
			return userRepo.findById(sid)    //findById(sid) returns an Optional<Student>,
					.map(ResponseEntity::ok)         //If the Optional<Student> is present, .map(...) executes.
					.orElse(ResponseEntity.notFound().build());
		}
		
		
		
		@DeleteMapping("/deleteById/{sid}")
		public  String  deleteById(@PathVariable int sid) 
		{
			Optional<User> userId =userRepo.findById(sid);
			
			if(userId.isPresent())
			{
			userRepo.deleteById(sid);
			return"user deleted successfully";
			}
			else
			{
			return "user Record not found";
			}
		}
		
		
		@PutMapping("/updateStudent/{sid}")         //Reads the JSON body of the HTTP request and converts it into a User object named userNew.
		public String updateUser(@PathVariable int sid,@RequestBody User userNew)  //@PathVariable int sid:
		//Extracts the value of {sid} from the URL and stores it in the variable sid.
		
		
		{
			Optional<User> result =userRepo.findById(sid);
			
			//Optional is used to avoid NullPointerException.
			
			if(result.isPresent()) 
			{
				User users =userRepo.findById(sid).get();
				users.setName(userNew.getName());
				users.setEmail(userNew.getEmail());
				
				userRepo.save(users);
				return " User updated successfully ";
			}
			else
			{
				return "No user found for update";
			}
		}
		
	
		@RequestMapping("/getAlluser")
		public List<User> getAlluser()
		{
			return  userDao.getAllUserDao();
			
		}
	
	
@GetMapping("/")
public String welcome()
{
	return "welcome Spring boot by api";
}



//answered
@PatchMapping("/get")
public String get()
{
	return "oh! no..";
}


}
