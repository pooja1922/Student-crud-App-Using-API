package com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;

import com.model.StudentData;

public interface StudentService {

	ResponseEntity<List<StudentData>> getData();

	List<StudentData> getAllStudents();

	StudentData createStudent(StudentData studentdata);

	void deleteById(int rno);

	Optional<StudentData> getDataById(int rno);

	ResponseEntity<StudentData> updateById(StudentData studentdata);

	

}
