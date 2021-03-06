package com.asamgir.example.pattern.validator;

public class Person {

	private int age;

	private String name;

	public Person(int i, String string) {
		this.age = i;
		this.name = string;
	}

	public Person() {
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + "]";
	}

}
