package com.controller;

import java.util.List;
import java.util.Optional;

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


import com.model.StudentData;
import com.service.StudentService;

@RestController
@RequestMapping("/StudentData")
public class StudentController {
	@Autowired 
	private StudentService service;
	@GetMapping("/greet")
	public String greet() 
	{
		return"welcome to web service";
	}
	
	@PostMapping("")
    public StudentData createStudent(@RequestBody StudentData studentdata) {
        return service.createStudent(studentdata);
    }

	
	@GetMapping("")
    public List<StudentData> getAllStudents() {
        return service.getAllStudents();
    }
	
	@GetMapping("/{rno}") //@RequestMapping("/getDataById/{id}")
	public Optional<StudentData> getDataById(@PathVariable int rno)
	{
		return service.getDataById(rno);
	}
	
	@DeleteMapping("/{rno}")
    public ResponseEntity<Void> deleteStudent(@PathVariable int rno) {
        service.deleteById(rno);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

	@PutMapping("/{rno}") //@RequestMapping("/updateById/{id}")
	public ResponseEntity<StudentData> updateById(@RequestBody StudentData studentdata )
	{
		return service.updateById(studentdata);
		
	}

	
}
