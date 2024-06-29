package com.jsp.spring.Autowring;

import org.springframework.stereotype.Component;

@Component
public class Student {
	
	private int sId;
	private String studentName;
	
	public Student(int sId, String studentName) {
		this.sId = sId;
		this.studentName = studentName;
	}

	public Student(int sId) {
		this.sId=sId;
	}
	public void display() {
		System.out.println("Student Name is : "+studentName+" Age is "+sId);
	}
}
