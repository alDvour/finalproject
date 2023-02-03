package com.axis.service;


import java.util.List;
import com.axis.model.Comments;

public interface CommentsService {

	public Comments addComments(Comments comments);
	
	public Comments updateComments(Comments comments);
	
	public List<Comments> getComments();
	
	
	
	
}
