package com.asamgir.example.comparator;

import java.util.function.Function;

import com.asamgir.example.domain.Person;

public class CustomComparatorImpl {

	public static void main(String[] args) {
		Person p1 = new Person(28, "Ajay");
		Person p2 = new Person(28, "Peter");
		Person p3 = new Person(30, "Andrea");
		Person p4 = new Person(33, "Ajay");
		
		Function<Person, String> getName = p -> p.getName();
		Function<Person, Integer> getAge = p -> p.getAge();
		
		// write factory method to create comparator from key extrator 
		CustomComparator<Person> cmpName = CustomComparator.comparing(getName);
		CustomComparator<Person> cmpAge = CustomComparator.comparing(getAge);
		
		System.out.println("p1 > p2 = " + (cmpName.compare(p1, p2) > 0));
		System.out.println("p1 > p2 = " + (cmpAge.compare(p1, p4) > 0));
		System.out.println("p1 > p2 = " + (cmpName.compare(p1, p4) == 0));	
	}
}
