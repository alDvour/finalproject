package com.axis.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.axis.model.News;



public interface NewsRepository extends JpaRepository<News, String>{

	

}

