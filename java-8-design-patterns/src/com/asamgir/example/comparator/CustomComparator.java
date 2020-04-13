package com.asamgir.example.comparator;

import java.util.function.Function;

@FunctionalInterface
public interface CustomComparator<T> {

	int compare(T t1, T t2);

	default CustomComparator<T> reversed() {
		return (t1, t2) -> this.compare(t2, t1);
	}

	static <T, U extends Comparable<U>> CustomComparator<T> comparing(Function<T, U> keyExtractor) {

		return (p1, p2) -> {
			U s1 = keyExtractor.apply(p1);
			U s2 = keyExtractor.apply(p2);
			return s1.compareTo(s2);
		};
	}
}
