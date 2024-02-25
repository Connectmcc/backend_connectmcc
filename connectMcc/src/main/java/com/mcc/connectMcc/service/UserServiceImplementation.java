package com.mcc.connectMcc.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.mcc.connectMcc.dto.UserDto;
import com.mcc.connectMcc.exceptions.UserException;
import com.mcc.connectMcc.modal.User;
import com.mcc.connectMcc.repository.UserRepository;

public class UserServiceImplementation implements UserService{
    @Autowired
	private UserRepository userRepository;
	
	
	@Override
	public User registerUser(User user) throws UserException {
	   
		Optional<User> isEmailExist=userRepository.findByEmail(user.getEmail());
		if(isEmailExist.isPresent()) {
			throw new UserException ("Email id Already Exixts");
			
		}
		Optional<User> isUsernameExist=userRepository.findyByUsername(user.getUsername());
		if(isUsernameExist.isPresent()) {
			throw new UserException ("Username is Already Taken..");
			
		}
		if(user.getEmail()==null || user.getPassword()==null || user.getUsername()==null || user.getName()==null) {
			throw new UserException("All fields are required");
		}
		
		User newUser=new User();
		
		newUser.setEmail(user.getEmail());
		newUser.setPassword(user.getPassword());
		newUser.setUsername(user.getUsername());
		newUser.setName(user.getName());
		
		return userRepository.save(newUser);
	}

	@Override
	public User findUserById(Integer userId) throws UserException {
	    Optional<User> opt=userRepository.findById(userId);
	    
	    if(opt.isPresent()) {
	    	return opt.get();
	    	}
	    throw new UserException("user does not exist with id:"+userId);
	
	}

	@Override
	public User findUserByProfile(String token) throws UserException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User findUserByUsername(String username) throws UserException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String followUser(Integer reqUserId, Integer followUserId) throws UserException {
	
		User reqUser=findUserById(reqUserId);
		User followUser=findUserById(followUserId);
		
		UserDto follower=new UserDto();
		
		
		follower.setEmail(reqUser.getEmail());
		follower.setId(reqUser.getId());
		follower.setName(reqUser.getName());
		follower.setUserImage(reqUser.getUsername());
		follower.setUsername(reqUser.getUsername());
		
		
		UserDto following=new UserDto();
		following.setEmail(follower.getEmail());
		following.setId(follower.getId());
		following.setUserImage(follower.getUserImage());
		following.setName(follower.getName());
		following.setUsername(following.getUsername());
		
		reqUser.getFollowing().add(following);
		followUser.getFollower().add(follower);
		
		
		userRepository.save(followUser);
		userRepository.save(reqUser);
		return "you are following"+followUser.getUsername();
	}

	@Override
	public String unFollowUser(Integer reqUserId, Integer followUserId) throws UserException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> findUserByIds(List<Integer> userIds) throws UserException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> searchUser(String query) throws UserException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User updateUserDetails(User updatedUser, User existingUser) throws UserException {
		// TODO Auto-generated method stub
		return null;
	}

}
