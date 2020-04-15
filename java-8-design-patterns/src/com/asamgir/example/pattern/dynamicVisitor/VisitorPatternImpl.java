package com.asamgir.example.pattern.dynamicVisitor;

import java.util.function.Consumer;

public class VisitorPatternImpl {

	public static void main(String[] args) {
		Car car = new Car();
		Engine engine = new Engine();
		Body body = new Body();

		Consumer<VisitorBuilder<String>> consumer1 = 
				Visitor.<String>forType(Car.class).execute(c -> "Visiting for" + c);
		
		Visitor<String> visitor = Visitor.of(consumer1);
		String visitedCar = visitor.visit(car);
		System.out.println(visitedCar);
		
		Consumer<VisitorBuilder<String>> consumer2 = 
				Visitor.<String>forType(Engine.class).execute(e -> "Visiting for" + e);
		
		Visitor<String> visitor2 = Visitor.of(consumer2);
		String visitedEngine = visitor2.visit(engine);
		System.out.println(visitedEngine);
		
		Consumer<VisitorBuilder<String>> consumer3 = 
				Visitor.<String>forType(Body.class).execute(b -> "Visiting for" + b);
		
		Visitor<String> visitor3 = Visitor.of(consumer3);
		String visitedBody = visitor3.visit(body);
		System.out.println(visitedBody);
	}

}
