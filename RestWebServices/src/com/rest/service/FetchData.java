package com.rest.service;

import java.util.List;

import com.model.Student;

public interface FetchData {
	
	//get details of all student
	public List<Student> getAllStudent() ;
	
	//add new student
	public List<Student> addStudent(Student stud) ;
	
	//delete student from student list
	public List<Student> deleteStudent(int id) ;
	
	//update student in student list
	public List<Student> updateStudent(int id, String name);
}
