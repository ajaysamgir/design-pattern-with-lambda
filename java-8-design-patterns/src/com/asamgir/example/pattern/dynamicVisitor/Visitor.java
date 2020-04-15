package com.asamgir.example.pattern.dynamicVisitor;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;

@FunctionalInterface
public interface Visitor<R> {

	R visit(Object o);

	static <R> Visitor<R> of(Consumer<VisitorBuilder<R>> consumer) {
		Map<Class, Function<Object, R>> registry = new HashMap<>();
		consumer.accept((type, function) -> registry.put(type, function));
		return o -> registry.get(o.getClass()).apply(o);
	}

	static <R> X<R> forType(Class<?> type) {
		return () -> type;
	}

	interface X<R> {
		Class<?> type();
		default Consumer<VisitorBuilder<R>> execute(Function<Object, R> function) {
			return visitorBuilder -> visitorBuilder.register(type(), function);
		}
	}
}
