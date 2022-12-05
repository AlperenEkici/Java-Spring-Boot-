package com.Alp.project2.Entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Table
@Entity(name="lesson")
public class Lesson {
	@Id
	@SequenceGenerator(
			name="lesson_sequence",
			sequenceName="lesson_sequence",
			allocationSize=1		
			)
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "lesson_sequence"
	)
	@Column(name="id")
	long id;
	
	@Column(name="studen_count")
	long studentCount;
	
	@Column(name="name",columnDefinition = "TEXT")
	String name;
	
	@Column(name="teacher")
	String teacher;
	
	@Column(name="category",columnDefinition = "TEXT")
	String category;

	public Lesson(long studentCount, String name, String teacher, String category) {
		super();
		this.studentCount = studentCount;
		this.name = name;
		this.teacher = teacher;
		this.category = category;
	}
	
}