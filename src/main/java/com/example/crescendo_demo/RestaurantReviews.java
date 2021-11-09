package com.example.crescendo_demo;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RestaurantReviews {
    private int total;
    private ArrayList<Reviews> reviews;

    public int getTotal() {
        return this.total;
    }

    public ArrayList<Reviews> getReviews() {
        return this.reviews;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public void setReviews(ArrayList<Reviews> reviews) {
        this.reviews = reviews;
    }
}
