package com.jonathan.secondattempt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication

@RestController
public class SecondattemptApplication {
	public static void main(String[] args) {
		SpringApplication.run(SecondattemptApplication.class, args);
	}
	@RequestMapping("/")
	public String hello() {
		return "Welcome to my page its a today's great day!";
	}
	@RequestMapping("/random")
	public String random() {
		return "Wow this is the best program I have ever worked with";
	}
}
