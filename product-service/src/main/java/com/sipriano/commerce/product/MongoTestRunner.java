package com.sipriano.commerce.product;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class MongoTestRunner implements CommandLineRunner {

	private final MongoTemplate mongoTemplate;

	@Override
	public void run(String... args) {
		System.out.println("Collections: " + mongoTemplate.getCollectionNames());
	}
}