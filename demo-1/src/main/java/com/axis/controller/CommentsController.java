package com.axis.controller;



import java.security.PublicKey;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.axis.model.Comments;
import com.axis.model.News;
import com.axis.service.CommentsService;


@RestController
@RequestMapping("/newsfeed/news")
@CrossOrigin(origins = "*")
public class CommentsController {

	@Autowired
	private  CommentsService commentsService;
	
	
	//add category
	@PostMapping("/")
	public ResponseEntity<Comments> addComments(@RequestBody Comments comments){
		Comments comments2 = this.commentsService.addComments(comments);
		return ResponseEntity.ok(comments2);
	}
	
	
	// get all newsfeed
	@GetMapping("/")
	public ResponseEntity<?> getComments(){
		return ResponseEntity.ok(this.commentsService.getComments());
	}
	
	//update comment
	@PutMapping("/")
	public Comments updateComments(@RequestBody Comments comments) {
		return  this.commentsService.updateComments(comments);
	}
	

}
