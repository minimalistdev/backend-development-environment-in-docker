package com.minimalistdev.springbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class SpringbackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbackendApplication.class, args);
	}
}
