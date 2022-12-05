package com.Alp.project2.Business.abstracts;

import java.util.List;

import com.Alp.project2.Core.Ultutiess.Results.DataResult;
import com.Alp.project2.Core.Ultutiess.Results.Result;
import com.Alp.project2.Entities.concretes.Lesson;

public interface LessonService {
	Result add(Lesson lesson);
	Result delete(Lesson lesson);
	DataResult<List<Lesson>> getall() ;
}
