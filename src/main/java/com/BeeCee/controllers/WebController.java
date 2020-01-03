package com.BeeCee.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.BeeCee.model.SignUp;
import com.BeeCee.model.UserDetails;
import com.BeeCee.repo.SignUpRepo;
import com.BeeCee.repo.UserDetailsRepo;

@RestController
@CrossOrigin(origins= {"http://192.168.3.34:3000"})
@Component
public class WebController {
	@Autowired
	UserDetailsRepo udr;
	@Autowired
	SignUpRepo sur;

	@GetMapping("/userDetails")
	public List<UserDetails> userdetails() {
		List<UserDetails> ud = new ArrayList<>();
		ud = (List<UserDetails>) udr.findAll();
		System.out.println(ud.toString());
		return ud;
	}

	@PostMapping("/SignUpPage")
	public  SignUp signupPage(@RequestBody SignUp signup) {
		System.out.println("Creating data");
		System.out.println("Data are...."+signup.toString());
		sur.save(signup);
		return signup;
	}

//	@GetMapping("/home")	
//	public String homePage() {
//		return "forward:/home.jsp";
//	}
//	
//	@GetMapping("/login")
//	public String loginPage() {
//		return "Login.jsp";
//	}
//	@GetMapping("/logout")
//	public String logoutPage() {
//		return "Logout.jsp";
//	}
}
