package com.axis.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.axis.model.Comments;


public interface CommentsRepository extends JpaRepository<Comments, String>{

	

}