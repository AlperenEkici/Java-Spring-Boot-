package com.Alp.project2.Business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Alp.project2.Business.abstracts.TeacherService;
import com.Alp.project2.Core.Ultutiess.Results.DataResult;
import com.Alp.project2.Core.Ultutiess.Results.Result;
import com.Alp.project2.Core.Ultutiess.Results.SuccessDataResult;
import com.Alp.project2.Core.Ultutiess.Results.SuccessResult;
import com.Alp.project2.DataAccess.TeacherRepostory;
import com.Alp.project2.Entities.concretes.Teacher;
@Service
public class TeacherManager implements TeacherService {
	TeacherRepostory teacherRepostory;
	@Autowired
	public TeacherManager(TeacherRepostory teacherRepostory) {
		super();
		this.teacherRepostory = teacherRepostory;
	}
	@Override
	public Result add(Teacher teacher) {
		teacherRepostory.save(teacher);
		return new SuccessResult("öğretmen eklendi.");
	}
	@Override
	public Result delete(Teacher teacher) {
		teacherRepostory.save(teacher);
		return new SuccessResult("öğretmen silindi.");
	}
	@Override
	public DataResult<List<Teacher>> getall() {
		return new SuccessDataResult<List<Teacher>>
		(this.teacherRepostory.findAll(), "Data listelendi");
	}

	
	

}
