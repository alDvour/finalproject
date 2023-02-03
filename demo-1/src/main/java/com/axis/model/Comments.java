package com.axis.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
@Entity
@Table(name="Comments")
public class Comments{
	@Column(name="comments")
	private String comments;

	
	@ManyToOne(fetch = FetchType.EAGER)
	private News news;
	public Comments() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Comments(String comments) {
		super();
		this.comments = comments;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}
	
	
}
