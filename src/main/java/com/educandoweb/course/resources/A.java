package com.educandoweb.course.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/as")
public class A {

	@GetMapping(value = "/{id}") 
	public Integer a(@PathVariable("id") int id) {
		return id*2;
	}
}
