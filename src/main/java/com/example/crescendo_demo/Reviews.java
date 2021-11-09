package com.example.crescendo_demo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
public class Reviews {
	private String id;
	private String url;
	private String text;
	private int rating;
	private String timeCreated;
	private User user;

	public String getId() {
		return this.id;
	}

	public String getUrl() {
		return this.url;
	}

	public String getText() {
		return this.text;
	}

	public int getRating() {
		return this.rating;
	}

	public String getTimeCreated() {
		return this.timeCreated;
	}

	public User getUser() {
		return this.user;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void setText(String text) {
		this.text = text;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public void setTimeCreated(String timeCreated) {
		this.timeCreated = timeCreated;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
