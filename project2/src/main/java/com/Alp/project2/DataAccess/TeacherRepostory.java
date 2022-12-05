package com.Alp.project2.DataAccess;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Alp.project2.Entities.concretes.Teacher;

public interface TeacherRepostory extends JpaRepository<Teacher, Long> {

}
