package com.cq.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/student")
public class StudentRestController {
	@GetMapping("/fetch")
	public ResponseEntity<String> findStudent(){
		return new ResponseEntity<>("Student details fetched", HttpStatus.OK);
		
	}
	@PostMapping("/register")
	public ResponseEntity<String> registerStudent(){
		return new ResponseEntity<>("Student Registered", HttpStatus.OK);
		
	}
	@DeleteMapping("/remove")
	public ResponseEntity<String> removeStudent(){
		return new ResponseEntity<>("Student data removed", HttpStatus.OK);
		
	}
	@PutMapping("/edit")
	public ResponseEntity<String> editStudent(){
		return new ResponseEntity<>("Student data modified", HttpStatus.OK);
		
	}
	

}
