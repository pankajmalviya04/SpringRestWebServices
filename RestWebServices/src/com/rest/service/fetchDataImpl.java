package com.rest.service;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.model.Student;

@Repository
public class fetchDataImpl implements FetchData{
	
	//get details of all student
	public List<Student> getAllStudent() {
		
		List<Student> student = new ArrayList<>();
		student.add(new Student(101, "james", "98653147"));
		student.add(new Student(102, "andrew", "5866994"));
		student.add(new Student(103, "kyle", "4322500"));
		student.add(new Student(104, "smitth", "30302525"));
		student.add(new Student(105, "dron", "7896633"));
		
		return student;
	}	
	//add new student
	public List<Student> addStudent(Student stud) {
		
		List<Student> student = new ArrayList<>();
		student = new fetchDataImpl().getAllStudent();
		System.out.println(student);
		student.add(stud);
		System.out.println(student);
		return student;
	}
	
	//delete student from student list
	public List<Student> deleteStudent(int id) {		
		
		List<Student> student = new ArrayList<>();
		Student deleteStudent = null;
		student = new fetchDataImpl().getAllStudent();
		
		for(Student s: student)
		{
			if(s.getId()==id)
			{
				deleteStudent = s;				
			}				
				
		}
		student.remove(deleteStudent);
		return student;
	}
	
	//update student in student list
	public List<Student> updateStudent(int id, String name) {		
		
		List<Student> student = new ArrayList<>();		
		student = new fetchDataImpl().getAllStudent();
		
		for(Student s: student)
		{
			if(s.getId()==id)
			{
				s.setName(name);;				
			}				
				
		}		
		return student;
	}
}
