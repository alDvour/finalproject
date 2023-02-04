package com.axis.service;


import java.util.List;
import com.axis.model.News;


public interface NewsService {

	public News addNews(News news);
	public News updateNews(News news);
	public List<News> getNews();
//	public List<News> getByDate(String date);
//	public List<News> getByDate(String date);
	public void deleteNews(String nId);
}
