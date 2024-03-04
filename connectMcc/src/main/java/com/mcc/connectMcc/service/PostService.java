package com.mcc.connectMcc.service;

import java.util.List;

import com.mcc.connectMcc.exceptions.PostException;
import com.mcc.connectMcc.exceptions.UserException;
import com.mcc.connectMcc.modal.Post;

public interface PostService {
   public Post createPost(Post post) throws UserException;
   
   public String deletePost(Integer postId, Integer userId) throws  UserException, PostException;
    
   public List<Post> findPostByUserId(Integer userId) throws UserException;
   
   public Post findPostById(Integer postId) throws PostException;
   
   public List<Post> findAllPostByUserIds(List<Integer> userIds) throws PostException, UserException;
   
   public String savedPost(Integer postId, Integer userId) throws PostException, UserException;
   
   public String unSavedPost(Integer postId,Integer userId) throws PostException, UserException;
   
   public Post likePost(Integer PostId, Integer userId) throws UserException, PostException;
   
   public Post unlikePost(Integer PostId, Integer userId) throws UserException, PostException;
   
} 
