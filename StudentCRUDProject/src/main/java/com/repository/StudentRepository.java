package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.StudentData;

public interface StudentRepository  extends JpaRepository<StudentData, Integer>{

}
