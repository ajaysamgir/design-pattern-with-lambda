package com.asamgir.example.pattern.dynamicRegistry;

import com.asamgir.example.domain.Person;

/**
 * 
 * @author Ajay Samgir
 *
 * @param <T>
 */
public interface Builder<Person> {

	/**
	 * This method is return nothing because purpose of this method is just registration of the factory 
	 * with right label 
	 * @param type
	 * @param factory
	 */
	void register (String type, Factory<? extends Person> factory);
}
