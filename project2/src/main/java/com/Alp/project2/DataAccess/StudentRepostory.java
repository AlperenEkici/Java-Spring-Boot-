package com.Alp.project2.DataAccess;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Alp.project2.Entities.concretes.Student;

@Repository
public interface StudentRepostory extends JpaRepository<Student , Long>{

}



