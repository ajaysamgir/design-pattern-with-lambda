package com.asamgir.example.pattern.factory;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import com.asamgir.example.domain.Person;

public interface PersonFactory extends Supplier<Person> {

	default Person createInstance() {
		return get();
	}

	default List<Person> create3Instances() {
		return IntStream.range(0, 3).mapToObj(index -> createInstance()).collect(Collectors.toList());
	}
}
