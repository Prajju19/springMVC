package com.dxc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

@GetMapping("/")
public String home()
{
return "login";
}

@PostMapping("/checklogin")
public String checklogin(Model model,@RequestParam String username,@RequestParam String password)
{
String returnpage="login";
System.out.println("Username -"+username);
System.out.println("Password -"+password);

String usernameServer="pajju";
String passwordServer="1234";


if(username.equalsIgnoreCase(usernameServer) && password.equalsIgnoreCase(passwordServer))
{

model.addAttribute("username", username);
return "homes";
}
return returnpage;



}



	

}
