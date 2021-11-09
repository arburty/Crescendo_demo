package com.example.crescendo_demo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
public class User {
	private String id;
	private String profileUrl;
	private String imageUrl;
	private String name;

	public String getId() {
		return this.id;
	}

	public String getProfileUrl() {
		return this.profileUrl;
	}

	public String getImageUrl() {
		return this.imageUrl;
	}

	public String getName() {
		return this.name;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setProfileUrl(String profileUrl) {
		this.profileUrl = profileUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public void setName(String name) {
		this.name = name;
	}

}
