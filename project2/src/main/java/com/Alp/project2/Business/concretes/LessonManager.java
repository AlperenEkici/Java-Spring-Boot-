package com.Alp.project2.Business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Alp.project2.Business.abstracts.LessonService;
import com.Alp.project2.Core.Ultutiess.Results.DataResult;
import com.Alp.project2.Core.Ultutiess.Results.Result;
import com.Alp.project2.Core.Ultutiess.Results.SuccessDataResult;
import com.Alp.project2.Core.Ultutiess.Results.SuccessResult;
import com.Alp.project2.DataAccess.LessonRepostory;
import com.Alp.project2.Entities.concretes.Lesson;

@Service
public class LessonManager implements LessonService{
	LessonRepostory lessonRepostory;
	
	
	@Autowired
	public LessonManager(LessonRepostory lessonRepostory) {
		super();
		this.lessonRepostory = lessonRepostory;
	}

	@Override
	public Result add(Lesson lesson) {
		this.lessonRepostory.save(lesson);
		return new SuccessResult("Ders Eklendi");
	}

	@Override
	public Result delete(Lesson lesson) {
		lessonRepostory.delete(lesson);
		return new SuccessResult("Ders Silindi");	}

	@Override
	public DataResult<List<Lesson>> getall() {
		return new SuccessDataResult<List<Lesson>>
		(this.lessonRepostory.findAll(),"Data listelendi");
	}

	
}
