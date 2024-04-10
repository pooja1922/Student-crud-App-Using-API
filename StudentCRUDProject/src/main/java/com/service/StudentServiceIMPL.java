package com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.model.StudentData;
import com.repository.StudentRepository;

@Service
public class StudentServiceIMPL implements StudentService {
@Autowired
private StudentRepository repo;

@Override
public ResponseEntity<List<StudentData>> getData() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public List<StudentData> getAllStudents() {
	// TODO Auto-generated method stub
	return repo.findAll();
}

@Override
public StudentData createStudent(StudentData studentdata) {
	// TODO Auto-generated method stub
	return repo.save(studentdata);
}

@Override
public void deleteById(int rno) {
    repo.deleteById(rno);
}

@Override
public Optional<StudentData> getDataById(int rno) {
	// TODO Auto-generated method stub
	return repo.findById(rno);
}

@Override
public ResponseEntity<StudentData> updateById(StudentData studentdata) {
	int rno = studentdata.getRno(); // Assuming getRno() returns the roll number
    Optional<StudentData> optionalStudentData = repo.findById(rno);
    if (optionalStudentData.isPresent())
    {
        StudentData existingStudentData = optionalStudentData.get();
        // Update the existing student data with the new values
        existingStudentData.setName(studentdata.getName());
        existingStudentData.setMarks(studentdata.getMarks());
        existingStudentData.setMono(studentdata.getMono());
        existingStudentData.setAddress(studentdata.getAddress());
        // Update other fields as needed
        // Save the updated student data
        StudentData updatedStudentData = repo.save(existingStudentData);
        return ResponseEntity.ok(updatedStudentData);
    } else {
        // If student data with the given roll number is not found, return ResponseEntity with status NOT_FOUND
        return ResponseEntity.notFound().build();
    }
}




}
