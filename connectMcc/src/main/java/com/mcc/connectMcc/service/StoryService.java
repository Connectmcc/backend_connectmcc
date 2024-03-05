package com.mcc.connectMcc.service;

import java.util.List;

import com.mcc.connectMcc.exceptions.StoryException;
import com.mcc.connectMcc.exceptions.UserException;
import com.mcc.connectMcc.modal.Story;

public interface StoryService {

	public  Story createStory(Story story, Integer userId) throws UserException;
	
	public  List<Story> findStoryByUserId(Integer userId) throws UserException,StoryException;
	
	
	
}
