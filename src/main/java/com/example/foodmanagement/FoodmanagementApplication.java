package com.example.foodmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.example.foodmanagement.repository")
public class FoodmanagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(FoodmanagementApplication.class, args);
	}

}
