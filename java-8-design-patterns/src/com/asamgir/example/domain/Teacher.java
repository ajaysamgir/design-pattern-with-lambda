package com.asamgir.example.domain;

public class Teacher extends Person {
	private String role;

	public Teacher(int i, String string, String role) {
		super(i, string);
		this.role = role;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
}
