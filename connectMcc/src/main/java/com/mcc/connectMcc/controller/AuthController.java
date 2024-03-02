package com.mcc.connectMcc.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mcc.connectMcc.exceptions.UserException;
import com.mcc.connectMcc.modal.User;
import com.mcc.connectMcc.service.UserService;

@RestController
public class AuthController {
	@Autowired
	private UserService userService;
	@PostMapping("/signup")
	public ResponseEntity<User> registerUserHandler(@RequestBody User user) throws UserException{
		User createdUser=userService.registerUser(user);
		return new ResponseEntity<User>(createdUser,HttpStatus.OK);
	}
	
	public ResponseEntity<User> signinHandler(Authentication auth) throws BadCredentialsException{
		
		Optional<User> opt=userRepo.findByEmail(auth.getName());
		if(opt.isPresent()) {
			
		}
		
		
		return null;
	}
}
