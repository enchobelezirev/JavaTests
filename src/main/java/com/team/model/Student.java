package com.team.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "student", uniqueConstraints = @UniqueConstraint(columnNames = "FACULTY_NUMBER"))
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int studentId;

	@Column(name = "FACULTY_NUMBER")
	private int facultyNumber;

	@Column(name = "STUDENT_NAME")
	private String name;

	@Column(name = "LAST_NAME")
	private String lastName;

	public Student() {
		// required by JPA
	}

	public Student(int studentId, int facultyNumber, String name,
			String lastName) {
		this.studentId = studentId;
		this.facultyNumber = facultyNumber;
		this.name = name;
		this.lastName = lastName;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public int getFacultyNumber() {
		return facultyNumber;
	}

	public void setFacultyNumber(int facultyNumber) {
		this.facultyNumber = facultyNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
