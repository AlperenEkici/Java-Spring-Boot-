package com.Alp.project2.Business.abstracts;

import java.util.List;

import com.Alp.project2.Core.Ultutiess.Results.DataResult;
import com.Alp.project2.Core.Ultutiess.Results.Result;
import com.Alp.project2.Entities.concretes.Student;


public interface StudentService {
	Result add(Student student) ;
	Result delete(Student student);
	DataResult<List<Student>> getall();
}
