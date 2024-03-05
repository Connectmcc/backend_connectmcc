package com.mcc.connectMcc.service;

import org.springframework.stereotype.Service;

import com.mcc.connectMcc.exceptions.CommentException;
import com.mcc.connectMcc.exceptions.UserException;
import com.mcc.connectMcc.exceptions.PostException;
import com.mcc.connectMcc.modal.Comment;
import com.mcc.connectMcc.repository.CommentRepository;

@Service


public class CommentServiceImplementation implements CommentService {
	
	private CommentRepository commentRepository;

	@Override
	public Comment createComment(Comment comment, Integer postId, Integer userId) throws UserException, PostException{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Comment findCommentById(Integer commentId) throws CommentException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Comment likeComment(Integer CommentId, Integer userId) throws CommentException, UserException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Comment unlikeComment(Integer commentId, Integer userId) throws CommentException, UserException {
		// TODO Auto-generated method stub
		return null;
	}

}
