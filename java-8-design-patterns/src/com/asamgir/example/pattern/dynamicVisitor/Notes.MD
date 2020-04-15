## Visitor Pattern
"Visitor represent an operation to be performed on the elements of the object structure Visitor lets you define a new operation without changing the classes of the elements on which it operates"

- Suppose you have set of existing classes they may be in the hierarchy or not so those classes or may extends themselves or not and you want to add operations on those classes without modifying those classes
- then all those classes need to expose an accept(Visitor) method. once your class does that it can be visited with this visitor object. 
- This accept method has to follow the certain pattern.

## How does Visitor pattern works?
- From the technical point of view, e.g if we have Car object then car have saveral parts : Engine, Body, Wheels and you want to implement visitor pattern on it. for that you need to add an accept method on car class that will take visitor as a parameter.
- Any class that accepts the visitor will have to have this kind of method and this accept will take a visitor as an interface, because in fact the operation you want to make on car class hierarchy is implement inside the visitor.

Usecase,
- I have a car and when this car is visited the engine, body, and the wheels needs to be visited too. then you need to forward this visitor to the engine, body, and wheels.

- Visitor pattern work with overloading mechanism not with overriding

```
public interface Visitor {
	void visit(Car car);
	void visit(Engine engine);
	void visit(Body body);
	void visit(Wheel wheel);
}
``` 
- with lambda function we can create dynamic visitor pattern
 