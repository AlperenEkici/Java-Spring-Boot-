package com.Alp.project2.DataAccess;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Alp.project2.Entities.concretes.Lesson;

public interface LessonRepostory extends JpaRepository<Lesson, Long>{

}
