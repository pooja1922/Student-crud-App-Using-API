package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentCrudProjectApplication {

	public static void main(String[] args) {
		System.out.println("application start");
		SpringApplication.run(StudentCrudProjectApplication.class, args);
		System.out.println("application stop");
	}

}
