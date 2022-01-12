package com.dxc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class EmployeeController {
	
			@Controller
			public class UserController {
			@GetMapping("/addnew")
			public String addNewUser()
			{
			return "newEmployee";
			}
			@PostMapping("/newuser")
			public String newUser(@RequestParam String username, @RequestParam String email,@RequestParam String password,@RequestParam String password_confirm)
			{
			System.out.println("Username-"+ username);
			System.out.println("email-"+email);
			System.out.println("Country-"+password);
			System.out.println("password"+password_confirm);

            return "homes";   

} 
			}
}