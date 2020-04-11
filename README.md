# design-pattern-with-lamda
Design pattern implementation using Java 8 lambda expression

## Default methods to chain and compose functions

### Chaining Consumers
- Java 8 provides Consumer interface which is functional interface with accept(T t) method which get one parameter and return nothing. 
- inside functional interface we can write number of default and static methods for expand the use of functional interface.
- to chaning a cosumer interface we can use default method, basically chaining means perform a task one after one with single line call.

e.g CustomerConsumerImpl.java

- chaining is one of the great example for use of default methods.

### Combining and Negating Predicates
- Predicate is functional interface which accept object and return boolean 
- Combining result of two object also possible with chaning and default methods
- e.g CustomerPredicateImpl.java