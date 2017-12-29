package com.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

public class Student {
	
	private int id;
	private String name;
	private String Mobile;	
//	@JsonFormat(pattern="dd/MM/yyyy")
//	private Date dob;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobile() {
		return Mobile;
	}
	public void setMobile(String mobile) {
		Mobile = mobile;
	}	
//	public Date getDob() {
//		return dob;
//	}
//	public void setDob(Date dob) {
//		this.dob = dob;
//	}
	public Student(int id, String name, String mobile) {
		super();
		this.id = id;
		this.name = name;
		Mobile = mobile;
	}
	public Student() {
	}
	

	
}
