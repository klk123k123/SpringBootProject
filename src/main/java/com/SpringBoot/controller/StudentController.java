package com.SpringBoot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBoot.model.Student;

@RestController
public class StudentController {
	
	@GetMapping("/list")
	public Student getStudent()
	{
		return new Student(101L,"Lakshmipollai","lak@gmail.com");
	}

}
