package com.educandoweb.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.course.entities.Teste;

@RestController
@RequestMapping(value = "/cara")
public class TesteResource {

	@GetMapping
	public ResponseEntity<Teste> testes() {
		Teste teste = new Teste(null, "teste");
		return ResponseEntity.ok(teste);
	}

}
