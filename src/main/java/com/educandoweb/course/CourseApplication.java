package com.educandoweb.course;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class CourseApplication {

	@GetMapping
	public static void main(String[] args) {
		SpringApplication.run(CourseApplication.class, args);
		
	}

}
