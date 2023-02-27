package com.jsp.Rest_API;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.jsp.controller")
@EnableJpaRepositories(basePackages = {"com.jsp.reopsitory"})
@EntityScan(basePackages = {"com.jsp.entity"})
public class RestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestApiApplication.class, args);
		System.out.println("Welcome");
	}

}
