package com.example.crescendo_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.client.RestTemplate;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CrescendoDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrescendoDemoApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder restTemplateBuilder) {
		return restTemplateBuilder
			.defaultHeader("Authorization", "Bearer eX9Ygrq4Xh65wrj7s93gAkNITsvBxySqBK80TDmRXbxaRnkwCWLaENZADKrX-mtV21JSxb1LexNRDiPRMZTjdaFUs6ITmhwNDP5gmxJLaP_Knop64qZG23I_6pKJYXYx")
			.build();
	}

}
