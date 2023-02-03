package com.axis.service;


import java.util.Set;

import com.axis.model.News;


public interface NewsService {

public News addNews(News news);
	
	public News updateNews(News news);
	
	public Set<News> getNews();
	
	
	
	public void deleteNews(String newsTitle);
}
