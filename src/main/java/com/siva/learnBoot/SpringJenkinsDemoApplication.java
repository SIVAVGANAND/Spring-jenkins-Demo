package com.siva.learnBoot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class SpringJenkinsDemoApplication {
	private static Logger logger = LoggerFactory.getLogger(SpringJenkinsDemoApplication.class);
	
	@PostConstruct
	public void init() {
		logger.info("testing the integration using Jenkins...");
		
	}

	public static void main(String[] args) {
		logger.info("Application is up and started");
		SpringApplication.run(SpringJenkinsDemoApplication.class, args);
	}

}
