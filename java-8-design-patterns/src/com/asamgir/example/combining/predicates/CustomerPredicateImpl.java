package com.asamgir.example.combining.predicates;

import com.asamgir.example.domain.Customer;

public class CustomerPredicateImpl {

	public static void main(String[] args) {
		
		CustomerPredicate p1 = customer -> customer.isActive();
		CustomerPredicate p2 = customer -> customer.getFirstName() != null;
		
		CustomerPredicate p3 = p1.andCheck(p2);
		System.out.println(p3.test(new Customer("Vaibhav", "Samgir", true)));
		System.out.println("" + p3.test(new Customer(null, "Samgir", true)));
		System.out.println("" + p3.test(new Customer("Ajay", "Samgir", false)));
	}

}
