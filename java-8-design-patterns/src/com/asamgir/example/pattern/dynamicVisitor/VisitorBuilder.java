package com.asamgir.example.pattern.dynamicVisitor;

import java.util.function.Function;

public interface VisitorBuilder<R> {
	
	void register(Class<?> type, Function<Object, R> function);

}
