# design-pattern-with-lambda
Design pattern implementation using Java 8 lambda expression

## Default methods to chain and compose functions

### Chaining Consumers
- Java 8 provides Consumer interface which is functional interface with accept(T t) method which get one parameter and return nothing. 
- inside functional interface we can write number of default and static methods for expand the use of functional interface.
- to chaining a consumer interface we can use default method, basically chaining means perform a task one after one with single line call.

e.g CustomerConsumerImpl.java

- chaining is one of the great example for use of default methods.

### Combining and Negating Predicates
- Predicate is functional interface which accept object and return Boolean 
- Combining result of two object also possible with chaining and default methods
- e.g CustomerPredicateImpl.java
- this means we can use default method to combine lambda expression.

### Build Comparator using Chaining and Composing Functions
- To create fluent API default and static methods are really powerful
- e.g CustomComparator.java

### Design Patterns using lambda functions and other java 8 features
- Factory is nothing but the object which is able to create another object. 
- Sometime in application we need to create objects in controlled way and for that purpose we can delegate the creation of your objects to the special objects. 
- e.g we have Circle class and we want to create factory object to get instance of Circle. in java 8 we have Supplier<T> interface which is functional interface which have get() method which will help to provide object.

```

public interface Supplier<T> {
	T get();
}

public static void main(String[] args) {
	
	Supplier<Circle> circleFactory = () -> new Circle();
	
	// Access instance from factory
	Circle c = factory.get();
}
```

- But if as per the requirement if we want to use any other method other than get() e.g getInstance() then we can create custom supplier functional interface and make it more powerful with default and static methods

- PersonFactoryImpl.java, PersonFactory.java
- If we want to return number of Person object then we can create another default method which is return list of Person objects.
- Sample code available in PersionFactory example
- In factory pattern default methods helps to create multiple similar objects but if we need to create different subtypes of Person class like Teacher, Student, Customer etc then we can use static methods inside functional interface.
- e.g PersonFactoryImpl.java, PersonFactory.java

### Registry using Builder
- A registry is also use to create other objects and registry has also same roll as factory. 
- the difference between factory and registry is registry works with key, you can pass a key to factory method and this factory method will create new object.
- switch case is most useful mechanism to design this pattern, but using this mechanism you need to know the objects details at the compile time using java 8 features what we can do is we can make it dynamic.
- Also it is recommended that for design registry pattern we can use HashMap because registry use string and constructor of specific class to create an object so we can use String as a key.
- there have some pinpoints to create registry pattern
	- Use Builder pattern for design a registry pattern.
	- add element into registry and seal it.
- JDK 8 have also some registry patterns with Builder pattern e.g Stream.Builder
- When we call build() method from Stream.Builder after that JDK will not allow Stream.Builder to call add() method and seal that object, due to several problems here :
	- If anyone get that reference and use then application will throw IllegalStateException 
- As per design pattern best practice we can implement Factory and Builder class separately and make them work together.
- Builder<T> class should be contains methods like add(), register()
- Factory<T> class should be contains methods like createFactory(String labelName)
- Factory<T> class will contain one static method 	build(Builder<T> builder) {}
 