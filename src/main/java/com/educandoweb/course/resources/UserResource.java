package com.educandoweb.course.resources;

import java.util.List;

import org.apache.catalina.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.course.entities.Person;
import com.educandoweb.course.services.UserService;


@RequestMapping(value = "/users")
@RestController
public class UserResource {
	
	@Autowired
	private UserService services;
	
	@GetMapping
	public ResponseEntity<List<Person>> findAll(){
	List<Person> list = services.findAll();
	list.add(new Person(null, "Marley", "marley@gmail.com", "2222223", "1234"));
	return ResponseEntity.ok().body(list);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Person> findById(@PathVariable Long id){
		Person obj = services.findById(id);
		return ResponseEntity.ok(obj);
	}
	
	
	
	
}
