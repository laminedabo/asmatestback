package com.gestion_posts.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="posts")
public class Post {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String title;
	private String descripition;
	
	public Post() {
		// Default constructor
	}
	

	public Post(long id, String title, String descripition) {
		this.setId(id);
		this.setTitle(title);
		this.setDescripition(descripition);
	}
	

	@Override
	public String toString() {
		return "Post {id=" + id + ", title=" + title + ", descripition=" + descripition + "}";
	}

	public Post(String title, String descripition) {
		super();
		this.title = title;
		this.descripition = descripition;
	}


	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescripition() {
		return descripition;
	}

	public void setDescripition(String descripition) {
		this.descripition = descripition;
	}

}
