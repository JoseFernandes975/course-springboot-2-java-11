package com.educandoweb.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.GetMapping;

import com.educandoweb.course.entities.Person;
import com.educandoweb.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	@GetMapping
	public void run(String... args) throws Exception {
		Person u1 = new Person(null, "Maria Brown","maria@gmail.com","9888888","12345");
		Person u2 = new Person(null, "Alex Green","alex@gmail.com","9777777","123456");
		
		userRepository.saveAll(Arrays.asList(u1, u2));
	}

}
