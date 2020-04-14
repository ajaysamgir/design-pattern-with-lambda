package com.asamgir.example.pattern.dynamicRegistry;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

import com.asamgir.example.domain.Person;
import com.asamgir.example.domain.Student;

/**
 * 
 * @author Ajay Samgir
 *
 */
public interface Registry {

	/**
	 * This method return PersonFactory object of specific type
	 * @param type
	 * @return
	 */
	Factory<? extends Person> buildPersonFactory(String type);
	
	/**
	 * create local map and return registory objects as per type 
	 * @param consumer 
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static Registry createRegistory(Consumer<Builder<Person>> consumer) {
		Map<String, Factory<Person>> registryMap = new HashMap<>();
		
		Builder<Person> builder = (type, factory) -> registryMap.put(type, (Factory<Person>) factory);
		consumer.accept(builder);
		return personType -> registryMap.get(personType);
		
	}
}
