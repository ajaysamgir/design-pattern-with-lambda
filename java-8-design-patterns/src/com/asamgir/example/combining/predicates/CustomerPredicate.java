package com.asamgir.example.combining.predicates;

import java.util.Objects;

import com.asamgir.example.domain.Customer;

@FunctionalInterface
public interface CustomerPredicate {
	boolean test(Customer c);

	default CustomerPredicate andCheck(CustomerPredicate other) {
		Objects.requireNonNull(other); // this line will prevent code from null pointer exception
		return (Customer c) -> this.test(c) && other.test(c);
	}
}
