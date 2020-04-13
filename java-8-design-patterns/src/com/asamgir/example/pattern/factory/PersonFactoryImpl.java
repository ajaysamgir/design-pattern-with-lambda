package com.asamgir.example.pattern.factory;

import java.util.List;

import com.asamgir.example.domain.Person;

public class PersonFactoryImpl {
	
	public static void main(String[] args) {
		
		PersonFactory personFactory = () -> new Person();
		
		Person p1 = personFactory.createInstance();
		Person p2 = personFactory.createInstance();
		Person p3 = personFactory.createInstance();
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		
		// get list of object
		
		List<Person> personList = personFactory.create3Instances();
		System.out.println(personList);
	}
	
}
