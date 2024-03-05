package com.mcc.connectMcc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mcc.connectMcc.exceptions.CommentException;
import com.mcc.connectMcc.exceptions.PostException;
import com.mcc.connectMcc.exceptions.UserException;
import com.mcc.connectMcc.modal.Comment;
import com.mcc.connectMcc.modal.User;
import com.mcc.connectMcc.service.CommentService;
import com.mcc.connectMcc.service.UserService;

@RestController
@RequestMapping("/api/comments")
public class CommentController {

	@Autowired
	private CommentService commentService;
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/create/{postId}")
	public ResponseEntity<Comment> createCommentHandler(@RequestBody Comment comment,@PathVariable Integer postId, @RequestHeader("Authorization") String token) throws UserException, PostException{
		
		User user=userService.findUserProfile(token);
		
		Comment createdComment=commentService.createComment(comment, postId, user.getId());
		
		return new ResponseEntity<Comment>(createdComment,HttpStatus.OK);
		
		
	}
	
	@PutMapping("/like/{commentId}")
	public ResponseEntity<Comment> likeCommentHandler(@RequestHeader("Authorization") String token, @PathVariable Integer commentId) throws CommentException, UserException{
		User user=userService.findUserProfile(token);
		 
		Comment comment=commentService.likeComment(commentId, user.getId());
		 return new ResponseEntity<Comment>(comment,HttpStatus.OK);
		
	}

	
	@PutMapping("/unlike/{commentId}")
	public ResponseEntity<Comment> unlikeCommentHandler(@RequestHeader("Authorization") String token, @PathVariable Integer commentId) throws CommentException, UserException{
		User user=userService.findUserProfile(token);
		 
		Comment comment=commentService.unlikeComment(commentId, user.getId());
		 return new ResponseEntity<Comment>(comment,HttpStatus.OK);
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

