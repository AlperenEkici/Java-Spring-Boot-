package com.Alp.project2.Api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Alp.project2.Business.abstracts.LessonService;
import com.Alp.project2.Core.Ultutiess.Results.DataResult;
import com.Alp.project2.Core.Ultutiess.Results.Result;
import com.Alp.project2.Entities.concretes.Lesson;


@RestController
@RequestMapping("/api/lesson")
@CrossOrigin
public class LessonController {
	LessonService lessonService;

	public LessonController(LessonService lessonService) {
		super();
		this.lessonService = lessonService;
	};
	
	@PostMapping("/add")
	public Result add(Lesson lesson) {
		
		return this.lessonService.add(lesson);
	}

	@PostMapping("/delete")
	public Result delete(Lesson lesson) {
		return this.lessonService.delete(lesson);	
		}

	@GetMapping("/getall")
	public DataResult<List<Lesson>> getall() {
		return this.lessonService.getall();	}
	
	
	
}
