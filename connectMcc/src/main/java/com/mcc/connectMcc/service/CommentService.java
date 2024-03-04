package com.mcc.connectMcc.service;

import com.mcc.connectMcc.exceptions.UserException;
import com.mcc.connectMcc.exceptions.CommentException;
import com.mcc.connectMcc.exceptions.PostException;
import com.mcc.connectMcc.modal.Comment;

public interface CommentService {
	
	public Comment createComment(Comment comment,Integer postId,Integer userId) throws UserException,PostException;

	public Comment findCommentById(Integer commentId) throws CommentException;
	
	public Comment likeComment(Integer CommentId,Integer userId)throws CommentException,UserException;

    public Comment unlikeComment(Integer commentId,Integer userId) throws CommentException,UserException;
}