package com.ribeiro.schoolcurriculum.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/discipline")
public class DisciplineController {

	@GetMapping("/")
	public ResponseEntity<String> helloWorld() {
		return ResponseEntity.status(HttpStatus.OK).body("Ok - Request Success!!!");
	}
	
	
}
