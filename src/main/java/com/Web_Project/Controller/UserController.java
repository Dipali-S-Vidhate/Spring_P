package com.Web_Project.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserController {

	
@GetMapping("/")
public String welcome()
{
	return "welcome Spring boot by api";
}
}
