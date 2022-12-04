package com.Alp.project2.Business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Alp.project2.Business.abstracts.StudentService;
import com.Alp.project2.Core.Ultutiess.Results.DataResult;
import com.Alp.project2.Core.Ultutiess.Results.Result;
import com.Alp.project2.Core.Ultutiess.Results.SuccessDataResult;
import com.Alp.project2.Core.Ultutiess.Results.SuccessResult;
import com.Alp.project2.DataAccess.StudentRepostory;
import com.Alp.project2.Entities.concretes.Student;

@Service
public class StudentManager implements StudentService{
	
	private StudentRepostory studentRepostory;
	
	@Autowired
	public StudentManager(StudentRepostory studentRepostory) {
		super();
		this.studentRepostory = studentRepostory;
	}
	
	
	@Override
	public Result add(Student student) {
		 studentRepostory.save(student);
		 return new SuccessResult("Ögrenci eklendi");
		
	}

	@Override
	public Result delete(Student student) {
		studentRepostory.delete(student);
		return new SuccessResult("Ögrenci Silindi");
		
	}


	@Override
	public DataResult<List<Student>> getall() {
		
		return new SuccessDataResult<List<Student>>
		(this.studentRepostory.findAll(), "Data listelendi");
	}

}
