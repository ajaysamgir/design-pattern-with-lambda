package com.asamgir.example.pattern.dynamicRegistry;

import java.util.function.Supplier;

import com.asamgir.example.domain.Person;

public interface Factory<T> extends Supplier<Person>{

	default Person newInstance() {
		return this.get();
	}

}
