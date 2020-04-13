package com.asamgir.example.pattern.staticRegistry;

import com.asamgir.example.domain.Student;

public class PersonRegistryImpl {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// create factory registry
		PersonRegistry pRegistry = new PersonRegistry();

		Factory<Student> studentFactory = (Factory<Student>) pRegistry.buildPersionFactory("Student");
		Factory<Student> teacherFactory = (Factory<Student>) pRegistry.buildPersionFactory("Teacher");
		Factory<Student> adminFactory = (Factory<Student>) pRegistry.buildPersionFactory("Admin");

		System.out.println("Student Instance : " + studentFactory.createInstance());
		System.out.println("Teacher Instance : " + teacherFactory.createInstance());
		System.out.println("Admin Instance : " + adminFactory.createInstance());

	}

}
