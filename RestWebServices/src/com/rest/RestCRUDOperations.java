package com.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Student;
import com.rest.service.FetchData;

@RestController
public class RestCRUDOperations {
	
	@Autowired(required=true)
	FetchData fetchData;
	//Get call
		@GetMapping(value="/all")
		public List<Student> getAllSudent(){		
			List<Student> student = fetchData.getAllStudent();
			return student;
		}	
	@GetMapping(value="/alljson", produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Student> getAllSudentInJsonFormat(){		
		List<Student> student = fetchData.getAllStudent();
		return student;
	}
	
	@GetMapping(value="/allxml", produces=MediaType.APPLICATION_XML_VALUE)
	public List<Student> getAllSudentInXmlFormat(){
		
		List<Student> student = fetchData.getAllStudent();
		return student;
	}
	
	//Put call
	@PutMapping(value="/add/{id}/{name}/{mobile}")
	public ResponseEntity<List<Student>> addStudent(@PathVariable ("id") int id,
							@PathVariable ("name") String name,
							@PathVariable ("mobile") String mobile){
		
		List<Student> student = fetchData.addStudent(new Student(id, name, mobile));
		return new ResponseEntity<List<Student>>(student, HttpStatus.CREATED);
	}	
	
	//Put call with cosumes type is JSON, similar we can call for XML and other types
	@PutMapping(value="/addJson", consumes=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Boolean> addJsonStudent(){			
			//List<Student> student = fetchData.addStudent(new Student(id, name, mobile));
			return new ResponseEntity<Boolean>(true, HttpStatus.CREATED);
		}	
	
	//delete Student
	@DeleteMapping(value="/delete/{id}")
	public ResponseEntity<List<Student>> addStudent(@PathVariable ("id") int id){

	List<Student> student = fetchData.deleteStudent(id);
	
	return new ResponseEntity<List<Student>>(student, HttpStatus.OK);
	}
	
}
