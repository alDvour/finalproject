//package com.axis.service.implementation;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.axis.model.Comments;
//import com.axis.repository.CommentsRepository;
//import com.axis.service.CommentsService;
//@Service
//public class CommentsServiceImpl implements CommentsService{
//
//	@Autowired
//	CommentsRepository commentsRepository;
//	@Override
//	public Comments addComments(Comments comments) {
//		// TODO Auto-generated method stub
//		return commentsRepository.save(comments);
//	}
//
//	@Override
//	public Comments updateComments(Comments comments) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public List<Comments> getComments() {
//		// TODO Auto-generated method stub
//		
//		return commentsRepository.findAll();
//	}
//
//}
