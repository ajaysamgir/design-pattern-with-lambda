package com.asamgir.example.pattern.dynamicRegistry;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;

/**
 * 
 * @author Ajay Samgir
 *
 */
@FunctionalInterface
public interface Registry<T> {

	/**
	 * This method return PersonFactory object of specific type
	 * 
	 * @param type
	 * @return
	 */
	Factory<? extends T> buildPersonFactory(String type);

	/**
	 * create local map and return registory objects as per type
	 * 
	 * @param consumer
	 * @return
	 */
	public static <T> Registry<T> createRegistory(Consumer<Builder<T>> consumer,
			Function<String, Factory<T>> errorHandler) {
		Map<String, Factory<T>> registryMap = new HashMap<>();

		Builder<T> builder = (type, factory) -> registryMap.put(type, factory);
		consumer.accept(builder);
		return personType -> registryMap.computeIfAbsent(personType, errorHandler);

	}
}
