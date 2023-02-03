package com.axis.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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

import com.axis.model.News;

import com.axis.service.NewsService;


@RestController
@RequestMapping("/newsfeed/news")
@CrossOrigin(origins = "*")
public class NewsController {

	@Autowired
	private  NewsService newsService;
	
	
	//add category
	@PostMapping("/")
	public ResponseEntity<News> addNews(@RequestBody News news){
		News news2 = this.newsService.addNews(news);
		return new ResponseEntity<News>(news2, HttpStatus.OK);
	}
	
	
	// get all 
	@GetMapping("/")
	public ResponseEntity<List<News>> getNews(){
		List<News> news = newsService.getNews();
		return new ResponseEntity<List<News>>(news, HttpStatus.OK);
		
	}
	
	//update 
	@PutMapping("/")
	public News updateNews(@RequestBody News news) {
		return  this.newsService.updateNews(news);
	}
	
	//delete 
	@DeleteMapping("/{newTitle}")
	public void deleteNews(@PathVariable("newsTitle") String newsTitle){
		
		 this.newsService.deleteNews(newsTitle);
		
	}
}
