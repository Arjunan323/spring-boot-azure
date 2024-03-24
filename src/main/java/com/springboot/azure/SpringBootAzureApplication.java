package com.springboot.azure;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringBootAzureApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAzureApplication.class, args);
	}

	@GetMapping("/message")
	public String getMessage() {
		return "Hello World!!!";
	}

}
