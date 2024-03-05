package com.mcc.connectMcc.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mcc.connectMcc.dto.UserDto;
import com.mcc.connectMcc.exceptions.PostException;
import com.mcc.connectMcc.exceptions.UserException;
import com.mcc.connectMcc.modal.Post;
import com.mcc.connectMcc.modal.User;
import com.mcc.connectMcc.repository.PostRepository;

@Service
public class PostServiceImplementation implements PostService {

	@Autowired
	private PostRepository postRepository;
	
	private UserService userService;
	
	@Override
	public Post createPost(Post post,Integer userId) throws UserException {
	    User user=userService.findUserById(userId);
	    
	    UserDto userDto=new UserDto();
	    userDto.setEmail(user.getEmail());
	    userDto.setId(user.getId());
	    userDto.setName(user.getName());
	    userDto.setUserImage(user.getImage());
	    userDto.setUsername(user.getUsername());
	    
	    post.setUser(userDto);
	    
	    Post createdPost=postRepository.save(post);
	    return createdPost;
	    
	}

	@Override
	public String deletePost(Integer postId, Integer userId) throws UserException, PostException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Post> findPostByUserId(Integer userId) throws UserException {
		
		List<Post> posts=postRepository.findByUserId(userId);
		
		if(posts.size()==0) {
			 throw new UserException("this user does  not have any post");
		}
		
		return posts;
	}

	@Override
	public Post findPostById(Integer postId) throws PostException {
        Optional<Post> opt=postRepository.findById(postId);
        
        if(opt.isPresent()) {
        	return opt.get();
        }
        
		throw new PostException("Post not found with id"+postId);
	}

	@Override
	public List<Post> findAllPostByUserIds(List<Integer> userIds) throws PostException, UserException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String savedPost(Integer postId, Integer userId) throws PostException, UserException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String unSavedPost(Integer postId, Integer userId) throws PostException, UserException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Post likePost(Integer PostId, Integer userId) throws UserException, PostException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Post unlikePost(Integer PostId, Integer userId) throws UserException, PostException {
		// TODO Auto-generated method stub
		return null;
	}

}
