package com.asamgir.example.chaining.consumer;

import java.util.Objects;

import com.asamgir.example.domain.Customer;

@FunctionalInterface
public interface CustomerConsumer {
	void printCustomerObject(Customer c);

	default CustomerConsumer andThen(CustomerConsumer c2) {
		return (Customer c) -> {
			Objects.requireNonNull(c2); // this line will prevent code from null pointer exception
			this.printCustomerObject(c);
			c2.printCustomerObject(c);
		};
	}
}
