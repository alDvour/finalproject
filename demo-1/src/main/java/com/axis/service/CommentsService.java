package com.axis.service;


import java.util.Set;

import com.axis.model.Comments;
import com.axis.model.News;



public interface CommentsService {

	public Comments addComments(Comments comments);
	
	public Comments updateComments(Comments comments);
	
	public Set<Comments> getComments();
	
	
	
	
}
