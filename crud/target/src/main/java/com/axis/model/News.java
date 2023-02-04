package com.axis.model;


import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.Table;

@Entity
@Table
public class News{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String nId;
	private String date;
	private String newsTitle;
	private String newsDescription;
	private String[] comments;
	
	
	public String[] getComments() {
		return comments;
	}
	public void setComments(String[] comments) {
		this.comments = comments;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public News() {
		super();
		// TODO Auto-generated constructor stub
	}
	public News(String nId,String date,String newsTitle, String newsDescription,String[] comments) {
		super();
		this.nId = nId;
		this.date=date;
		this.newsTitle = newsTitle;
		this.newsDescription = newsDescription;this.comments=comments;
	}
	public String getnId() {
		return nId;
	}
	public void setnId(String nId) {
		this.nId = nId;
	}
	public String getNewsTitle() {
		return newsTitle;
	}
	public void setNewsTitle(String newsTitle) {
		this.newsTitle = newsTitle;
	}
	public String getNewsDescription() {
		return newsDescription;
	}
	public void setNewsDescription(String newsDescription) {
		this.newsDescription = newsDescription;
	}
	
	
}
