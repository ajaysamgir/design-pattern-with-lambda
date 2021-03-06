package com.asamgir.example.domain;

public class Admin extends Person {

	private String role;

	public Admin() {
		super();
	}

	public Admin(int i, String string, String role) {
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
		return "Admin [Name=" +super.getName() + " Age=" + super.getAge() +" role=" + role + "]";
	}
}
