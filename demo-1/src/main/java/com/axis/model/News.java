package com.axis.model;

import java.util.LinkedHashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="NewsFeed")
public class News{
	@Id
	@Column(name="news")
	private String newsTitle;
	private String newsDescription;
	
	@OneToMany(mappedBy = "news",fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	@JsonIgnore
	private Set<Comments> comments = new LinkedHashSet<>();
	public News() {
		super();
		// TODO Auto-generated constructor stub
	}
	public News(String newsTitle, String newsDescription) {
		super();
		this.newsTitle = newsTitle;
		this.newsDescription = newsDescription;
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
