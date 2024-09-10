package com.SpringBoot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.SpringBoot.model.Student;

@Controller("/api")
public class StudentController {
	
	@GetMapping("/list")
	public Student getStudent()
	{
		return new Student(101L,"Lakshmipollai","lak@gmail.com");
	}

}
