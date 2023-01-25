package com.example.Student.Database.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
 
@Entity
public class Student {
	@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long Rollno;
    private String studentname;
	private String Branch;
   
	public Student() {
 
	}
	public Student(Long id, String studentname, String Branch ) {
	
		this.Rollno = id;
		this.studentname = studentname;
		this.Branch = Branch;
	
	}
	public Long getId() {
		return Rollno;
	}
	public void setId(Long id) {
		this.Rollno = id;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public String getBranch() {
		return Branch;
	}
	public void setBranch(String Branch) {
		this.Branch = Branch;
	}


 
}
