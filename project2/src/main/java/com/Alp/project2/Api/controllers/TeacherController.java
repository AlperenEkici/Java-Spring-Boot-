package com.Alp.project2.Api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Alp.project2.Business.abstracts.TeacherService;
import com.Alp.project2.Core.Ultutiess.Results.DataResult;
import com.Alp.project2.Core.Ultutiess.Results.Result;
import com.Alp.project2.Entities.concretes.Teacher;

@RestController
@RequestMapping("/api/teacher")
@CrossOrigin
public class TeacherController {
	TeacherService teacherService;

	public TeacherController(TeacherService teacherService) {
		super();
		this.teacherService = teacherService;
	} 
	@PostMapping("/add")
	public Result add( Teacher teacher) {
		
		return this.teacherService.add(teacher);
	}
	
	@PostMapping("/delete")
	public Result delete( Teacher teacher) {
		
		return this.teacherService.delete(teacher);
	}
	
	@GetMapping("/getall")
	public DataResult<List<Teacher>> getall() {	
		return this.teacherService.getall();
	}
	
	
	
}
