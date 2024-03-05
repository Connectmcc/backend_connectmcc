package com.mcc.connectMcc.service;

import java.util.List;

import com.mcc.connectMcc.exceptions.UserException;
import com.mcc.connectMcc.modal.User;

public interface UserService {

	public User registerUser(User user) throws UserException;
	public User findUserById(Integer userId) throws UserException;
	public User findUserProfile(String token) throws UserException;
	public User findUserByUsername (String username) throws UserException;
	public String followUser(Integer reqUserId, Integer followUserId) throws UserException;
	
	public String unFollowUser(Integer reqUserId, Integer followUserId) throws UserException;
	
	public List<User> findUserByIds(List<Integer> userIds) throws UserException; 
	
	public List<User> searchUser(String query) throws UserException;
	
	public User updateUserDetails(User updatedUser, User existingUser) throws UserException;
	
	
}
