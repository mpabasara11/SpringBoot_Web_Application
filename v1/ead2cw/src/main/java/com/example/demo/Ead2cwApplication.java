package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.controllers")
@EntityScan("com.model")
@EnableJpaRepositories("com.model")
public class Ead2cwApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ead2cwApplication.class, args);
	}

}
