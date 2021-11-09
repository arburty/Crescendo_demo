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
}
