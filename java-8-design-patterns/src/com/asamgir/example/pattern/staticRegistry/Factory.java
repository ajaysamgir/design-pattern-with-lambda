package com.asamgir.example.pattern.staticRegistry;

import java.util.function.Supplier;

public interface Factory<T> extends Supplier<T> {

	default T createInstance() {
		return get();
	}
}