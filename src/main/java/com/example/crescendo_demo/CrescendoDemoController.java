package com.example.crescendo_demo;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CrescendoDemoController {

    @Autowired
    RestTemplate restTemplate;

	private static final Logger log = LoggerFactory.getLogger(CrescendoDemoController.class);

    @GetMapping(value = "/yelp/reviews", produces = "application/json")
    public RestaurantReviews allReviews(
            @RequestParam(value = "restaurant" , defaultValue = "casa-bonita-lakewood-2") String restaurant)
    {
        log.info("--CrescendoDemoController#allReviews--");
        log.debug("restaurant:" + restaurant);
        RestaurantReviews restReviews = restTemplate.getForObject("https://api.yelp.com/v3/businesses/" + restaurant + "/reviews", RestaurantReviews.class);
        return restReviews;
    }

    @GetMapping(value = "/yelp/justreviews", produces = "application/json")
    public  ArrayList<String> justReviews(
            @RequestParam(value = "restaurant" , defaultValue = "casa-bonita-lakewood-2") String restaurant)
    {
        log.info("--CrescendoDemoController#justReviews--");
        ArrayList<String> result = new ArrayList<>();

        RestaurantReviews restReviews = restTemplate.getForObject("https://api.yelp.com/v3/businesses/" + restaurant + "/reviews", RestaurantReviews.class);

        ArrayList<Reviews> reviews = restReviews.getReviews();
        for (Reviews rv : reviews) {
            result.add(rv.getUser().getName() + " Rated " + restaurant + " a " +
                    rv.getRating() + "/5, and said:\n" +
                    rv.getText());
        }
        return result;
    }

    // simple help message.
    @GetMapping(value = "/help")
    public String help() {
        return "the availble endpoints are:\n" +
            "GET: '/yelp/reviews'\n" +
            "   param: restaurant defaultValue='casa-bonita-lakewood-2'";
    }
}
