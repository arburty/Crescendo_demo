package com.example.crescendo_demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CrescendoDemoController {

	private static final Logger log = LoggerFactory.getLogger(CrescendoDemoController.class);

    @GetMapping(value = "/yelp/reviews")
    public String allReviews(
            @RequestParam(value = "restaurant" , defaultValue = "casa-bonita-lakewood-2") String restaurant)
    {
        log.info("--CrescendoDemoController#AllReviews--");
        return restaurant;
    }
}
