package com.Alp.project2.Api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Alp.project2.Business.abstracts.StudentService;
import com.Alp.project2.Core.Ultutiess.Results.DataResult;
import com.Alp.project2.Core.Ultutiess.Results.Result;
import com.Alp.project2.Entities.concretes.Student;

@RestController
@RequestMapping("/api/student")
@CrossOrigin
public class StudentController {
	StudentService studentService;

	@Autowired
	public StudentController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}
		
	@PostMapping("/add")
	public Result add( Student student) {
		
		return this.studentService.add(student);
	}
	
	@PostMapping("/delete")
	public Result delete( Student student) {
		
		return this.studentService.delete(student);
	}
	
	@GetMapping("/getall")
	public DataResult<List<Student>> getall() {	
		return this.studentService.getall();
	}
	
}
