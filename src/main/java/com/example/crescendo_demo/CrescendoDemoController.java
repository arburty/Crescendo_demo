package com.example.crescendo_demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CrescendoDemoController {

    @GetMapping(value = "/yelp/reviews")
    public String allReviews(@RequestParam(value = "restaurant"
                , defaultValue = "casa-bonita-lakewood-2") String restaurant) {
        return restaurant;
    }
}
