package com.axis.controller;





import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.axis.model.Comments;
import com.axis.service.CommentsService;


@RestController
@RequestMapping("/newsfeed/comments")
@CrossOrigin(origins = "*")
public class CommentsController {

	@Autowired
	private  CommentsService commentsService;
	
	
	//add category
	@PostMapping("/")
	public ResponseEntity<Comments> addComments(@RequestBody Comments comments){
		Comments comments2 = this.commentsService.addComments(comments);
		return new ResponseEntity<Comments>(comments2, HttpStatus.OK);
	}
	
	
	// get all 
	@GetMapping("/")
	public ResponseEntity<?> getComments(){
		List<Comments> comments = commentsService.getComments();
		return new ResponseEntity<List<Comments>>(comments, HttpStatus.OK);
	}
	
	//update comment
	@PutMapping("/")
	public Comments updateComments(@RequestBody Comments comments) {
		return  this.commentsService.updateComments(comments);
	}
	

}
