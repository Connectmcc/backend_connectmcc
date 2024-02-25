package com.mcc.connectMcc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mcc.connectMcc.exceptions.UserException;
import com.mcc.connectMcc.modal.User;
import com.mcc.connectMcc.response.MessageResponse;
import com.mcc.connectMcc.service.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
	private UserService userService;
   
    @GetMapping("/id/{id}")
	public ResponseEntity<User> findUserByIdHandler(@PathVariable Integer id) throws UserException{
    	User user=userService.findUserById(id);
    	
		return new ResponseEntity<User>(user, HttpStatus.OK);
	}
	
	@GetMapping("/username/{username}")
	public ResponseEntity<User> findUserByUsernameHandler(@PathVariable String username) throws UserException{
		User user=userService.findUserByUsername(username);
		return new ResponseEntity<User>(user,HttpStatus.OK);
	}
	
	
	@PutMapping("follow/{followUserId}")
	public ResponseEntity<MessageResponse> followUserHandler(@PathVariable Integer followUserId){
	
		//MessageResponse res=userService.followUser(followUserId, followUserId)
		return null;
	}
	@PutMapping("/unfollow/{userId}")
	public ResponseEntity<MessageResponse> unFollowUserHandler(@PathVariable Integer userId){
	
		//MessageResponse res=userService.followUser(followUserId, followUserId)
		return null;
	}
	
	@PutMapping("/req")
	public ResponseEntity<MessageResponse> findUserProfileHandler(@RequestHeader("Authorization") String token){
	
		
		return null;
	}
	
	@GetMapping("/m/{userIds}")
	public ResponseEntity<List<User>> findUserByIdsHandler(@PathVariable List<Integer> userIds) throws UserException{
		List<User> users=userService.findUserByIds(userIds);
		return new ResponseEntity<List<User>>(users,HttpStatus.OK);
	}
	
	
	
}
