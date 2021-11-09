package com.example.crescendo_demo;

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
    public String allReviews(
            @RequestParam(value = "restaurant" , defaultValue = "casa-bonita-lakewood-2") String restaurant)
    {
        log.info("--CrescendoDemoController#AllReviews--");
        log.debug("restaurant:" + restaurant);
        // Object as a placeholder for now.
        Object o = restTemplate.getForObject("https://api.yelp.com/v3/businesses/" + restaurant + "/reviews", Object.class);
        return restaurant;
    }
}
