package com.asamgir.example.pattern.dynamicRegistry;

/**
 * 
 * @author Ajay Samgir
 *
 * @param <T>
 */
@SuppressWarnings("hiding")
@FunctionalInterface
public interface Builder<T> {

	/**
	 * This method is return nothing because purpose of this method is just registration of the factory 
	 * with right label 
	 * @param type
	 * @param factory
	 */
	void register (String type, Factory<T> factory);
}
