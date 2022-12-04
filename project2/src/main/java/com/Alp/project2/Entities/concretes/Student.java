package com.Alp.project2.Entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Table(
		name ="student",
		uniqueConstraints = {
				@UniqueConstraint(name = "student_email_unique", columnNames="email")
		}
		
		)

@Entity(name="Student")
public class Student {
	
	@Id
	@SequenceGenerator(
			name="student_sequence",
			sequenceName="student_sequence",
			allocationSize=1		
			)
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "student_sequence"
	)
	
	@Column(name="id")
	private Long id;
	
	@Column(name="first_name",
			nullable = false,
			columnDefinition = "TEXT"
			)
	private String firstName;
	
	@Column(name="last_name",
			nullable = false,
			columnDefinition = "TEXT"
			)
	private String lastName;
	
	@Column(name="email",
			nullable = false,
			columnDefinition = "TEXT"
			
			)
	private String email;
	
	@Column(name="age",
			nullable = false
			)
	private Integer age;

	public Student(String firstName, String lastName, String email, Integer age) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.age = age;
	}
	
	
	
}
