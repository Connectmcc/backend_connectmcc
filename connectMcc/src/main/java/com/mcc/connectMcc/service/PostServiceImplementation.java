package com.mcc.connectMcc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mcc.connectMcc.exceptions.PostException;
import com.mcc.connectMcc.exceptions.UserException;
import com.mcc.connectMcc.modal.Post;
import com.mcc.connectMcc.repository.PostRepository;

@Service
public class PostServiceImplementation implements PostService {

	@Autowired
	private PostRepository postrepository;
	
	
	@Override
	public Post createPost(Post post) throws UserException {
	   
		return null;
	}

	@Override
	public String deletePost(Integer postId, Integer userId) throws UserException, PostException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Post> findPostByUserId(Integer userId) throws UserException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Post findPostById(Integer postId) throws PostException {
		// TODO Auto-generated method stub
		return null;
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
