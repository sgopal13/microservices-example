package com.users;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
public class UsersApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(UsersApplication.class, args);
		
	}

	@Bean
	public RestTemplate getTemplate() {
		return new RestTemplate();
	}
}
