### Dynamic Registry design pattern
- it is recommended that for design registry pattern we can use HashMap because registry use string and constructor of specific class to create an object so we can use String as a key.
- using switch case for registry pattern we need to know object details at compile-time, here we have implementation in dynamic way using another two patterns factory and builder

### Factory.java
- Factory interface inherit from Supplier<Person> which responsible for return object of Person class.
- we can directly use Supplier<Person> instead if name get() is fine for you.

### Builder.java
- this is functional interface use for register factory class with right label.
- this interface follows Consumer pattern which take two parameters but return nothing
- this interface is use inside register class where we put instances inside HashMap.

### Registry.java
- Registry is functional interface which is build PersonFactory according to parameter value type.
- e.g parameter type is "Student" then it will return Student object

### ErrorHandling
- If we pass parameter which is not valid then program should throw IllegalArgumentException
- With switch case we can throw if execution flows go inside default section of switchcase
- Here in dynamic registry implementation we can throw with customize error handling
- If our HashMap return null from createRegistory() method then it means type is invalid.
- There are couple of ways to handle this : 
	1. use getOrDefault() method to fetch data from HashMap
	2. another recommended way is computeIfabsent(factory, errorHandlerFunction); here you need to write errorHandlerFunction code with Function interface.
	
- So this registry example is functional interface which is implemented using lambda expression but this lambda is in fact integrated inside the API code.
- The client code does not see that this is lambda expression that is implementing this registry. 
- it gives us very clean and compact code and also very safe because registry in itself inside HashMap absolutely hidden from the outside. that map is local variable of the Registry interface.
- So this implementation is very safe, robust and performant.

The Factory/Register/Builder elements can be modeled with functional interfaces and implemented using lambdas   