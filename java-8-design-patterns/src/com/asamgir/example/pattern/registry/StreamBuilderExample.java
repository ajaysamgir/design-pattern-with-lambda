package com.asamgir.example.pattern.registry;

import java.util.stream.Stream;

public class StreamBuilderExample {
	
	public static void main(String[] args) {
		Stream.Builder<String> strStreamBuilder = Stream.builder();
		
		strStreamBuilder.add("One");
		strStreamBuilder.add("Two");
		strStreamBuilder.add("Three");
		strStreamBuilder.add("Four");
		strStreamBuilder.add("Five");
		
		Stream<String> strStream = strStreamBuilder.build();
		
		/**
		 * once we call method build() then JDk not allow to call add() method to becasue that
		 * builder object is sealed it will throw IllegalStateException for below line
		 */
		//strStreamBuilder.add("test");
		
		strStream.forEach(System.out::println);
	}
}
