## Validator Pattern
- Validator pattern is not part of gang of four.
- Validator is itself a object its going to perform a validation in certain way.
- lambda functions provide way to implement validator pattern in dynamic way and now since it is lambda function so its not an object anyway.

### How it works?
- If you have need to validate form, validator validates all fields then produce set of exceptions
- Set of exceptions contains error messages of each fields and then throw single exception with all that set of errors
- in the example we have taken person class which have name and age fields and name should not be null and age value should not less than zero in this case.
- 