package com.asamgir.example.pattern.staticRegistry;

import com.asamgir.example.domain.Admin;
import com.asamgir.example.domain.Person;
import com.asamgir.example.domain.Student;
import com.asamgir.example.domain.Teacher;

public class PersonRegistry {
	
	public Factory<? extends Person> buildPersionFactory(String type) {
		switch (type) {
		case "Student": return () -> new Student(1, "Sachin", "Student");
		case "Teacher": return () -> new Teacher(1, "Dhoni", "Teacher");
		case "Admin": return () -> new Admin(1, "Yuvraj", "Admin");
		default:
			throw new IllegalArgumentException("Unexpected value: " + type);
		}
	}

}
