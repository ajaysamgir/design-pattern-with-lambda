package com.asamgir.example.chaining.consumer;

import com.asamgir.example.domain.Customer;

public class CustomerConsumerImpl {

	public static void main(String[] args) {
		CustomerConsumer c1 = customer -> System.out
				.println("Name : " + customer.getFirstName() + " " + customer.getLastName());

		c1.printCustomerObject(new Customer("Ajay", "Samgir", true));

		// chaining 2 customers with default method and()

		CustomerConsumer c2 = customer -> System.out
				.println("Name : " + customer.getFirstName() + " " + customer.getLastName());

		CustomerConsumer c3 = customer -> System.out
				.println("Name : " + customer.getFirstName() + " " + customer.getLastName());

		/*
		 * c2 will pass as a internal object (this) and c3 will be a external object
		 * also we need to prevent application from runtime exception as we pass c3 as
		 * external parameter that may be null sometime
		 * add prevention code inside functional interface
		 */

		CustomerConsumer c4 = c2.andThen(c3);
		c4.printCustomerObject(new Customer("Ajay", "Samgir", true));
	}

}
