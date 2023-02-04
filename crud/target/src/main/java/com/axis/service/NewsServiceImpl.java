package com.axis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.axis.model.News;
import com.axis.repository.NewsRepository;


@Service
public class NewsServiceImpl implements NewsService {

	@Autowired
	NewsRepository newsRepository;
	@Override
	public News addNews(News news) {
		// TODO Auto-generated method stub
		
		return newsRepository.save(news);
	}
	

	@Override
	public News updateNews( News news) {
		// TODO Auto-generated method stub
	return newsRepository.save(news);
	}

	@Override
	public List<News> getNews() {
		// TODO Auto-generated method stub
		return newsRepository.findAll();
	}

	@Override
	public void deleteNews(String nId) {
		// TODO Auto-generated method stub
		
		this.newsRepository.deleteById(nId);
		
	}



	

}
