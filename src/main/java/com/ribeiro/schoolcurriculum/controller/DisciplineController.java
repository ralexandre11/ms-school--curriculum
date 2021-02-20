package com.ribeiro.schoolcurriculum.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ribeiro.schoolcurriculum.entity.Discipline;
import com.ribeiro.schoolcurriculum.service.DisciplineServiceImpl;

@RestController
@RequestMapping("/discipline")
public class DisciplineController {

	@Autowired
	private DisciplineServiceImpl service;
	
	@GetMapping
	public ResponseEntity<List<Discipline>> allDiscipline() {
		return ResponseEntity.status(HttpStatus.OK).body(service.getAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Discipline> getDisciplineById(@PathVariable("id") Long id) {
		return ResponseEntity.status(HttpStatus.OK).body(service.getById(id));
	}
	
	@PostMapping
	public ResponseEntity<Discipline> createDiscipline(@RequestBody Discipline discipline) {
		return ResponseEntity.status(HttpStatus.CREATED).body(service.save(discipline));
	}

	@PutMapping("/{id}")
	public ResponseEntity<Discipline> updateDiscipline(@PathVariable("id") Long id, @RequestBody Discipline discipline) {
		return ResponseEntity.status(HttpStatus.OK).body(service.update(id, discipline));
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Boolean> deleteDiscipline(@PathVariable("id") Long id) {
		return ResponseEntity.status(HttpStatus.OK).body(service.delete(id));
	}
	
}
