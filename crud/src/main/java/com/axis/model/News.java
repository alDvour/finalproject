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
	private int nId;
	private String date;
	private String newsTitle;
	private String newsDescription;
	
	
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
	public News(int nId,String date,String newsTitle, String newsDescription) {
		super();
		this.nId = nId;
		this.date=date;
		this.newsTitle = newsTitle;
		this.newsDescription = newsDescription;
	}
	public int getnId() {
		return nId;
	}
	public void setnId(int nId) {
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
