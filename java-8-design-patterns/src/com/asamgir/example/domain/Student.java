package com.asamgir.example.domain;

public class Student extends Person {
	private String role;

	public Student() {
		super();
	}
		
	public Student(int i, String string, String role) {
		super(i, string);
		this.role = role;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "Student [Name=" +super.getName() + " Age=" + super.getAge() +" role=" + role + "]";
	}
	
	
}
