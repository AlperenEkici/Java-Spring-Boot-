package com.Alp.project2.Business.abstracts;

import java.util.List;

import com.Alp.project2.Core.Ultutiess.Results.DataResult;
import com.Alp.project2.Core.Ultutiess.Results.Result;
import com.Alp.project2.Entities.concretes.Teacher;

public interface TeacherService {
	Result add(Teacher teacher);
	Result delete(Teacher teacher);
	DataResult<List<Teacher>> getall(); 

}
