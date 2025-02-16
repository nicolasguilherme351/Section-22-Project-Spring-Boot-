package com.educandoweb.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.course.entities.Book;
import com.educandoweb.course.services.BookService;

@RestController
@RequestMapping(value = "/books")
public class BookResource {

	@Autowired
	private BookService service;

	@GetMapping(value = "/aa")
	private ResponseEntity<List<Book>> findAll() {
		List<Book> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	private Book findById(@PathVariable long id) {
		return service.findById(id);
	}

}
