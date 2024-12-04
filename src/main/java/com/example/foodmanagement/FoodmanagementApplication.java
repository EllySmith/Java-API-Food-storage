package com.example.foodmanagement;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.example.foodmanagement.repository")
public class FoodmanagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(FoodmanagementApplication.class, args);
        System.out.println("The app is running");
    }

    @Bean
    public CommandLineRunner logServerPort(ApplicationContext applicationContext) {
	return args -> {
	    if (applicationContext instanceof ServletWebServerApplicationContext) {
		   int serverPort = ((ServletWebServerApplicationContext) applicationContext).getWebServer().getPort();
		   System.out.println("Tomcat started on port(s): " + serverPort);
	    }
	};
 }
    }
