package com.asamgir.example.pattern.dynamicRegistry;

import java.util.function.Consumer;

import com.asamgir.example.domain.Admin;
import com.asamgir.example.domain.Person;
import com.asamgir.example.domain.Student;
import com.asamgir.example.domain.Teacher;

public class DynamicRegistryImpl {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		Consumer<Builder<Person>> consumer1 = builder -> builder.register("Student", Student::new);

		Consumer<Builder<Person>> consumer2 = builder -> builder.register("Teacher", Teacher::new);

		Consumer<Builder<Person>> consumer3 = builder -> builder.register("Admin", Admin::new);

		Consumer<Builder<Person>> consumer = consumer1.andThen(consumer2).andThen(consumer3);

		Registry<?> createRegistory = Registry.createRegistory(consumer, s -> {throw new IllegalArgumentException("" + s);});

		Factory<Student> buildStudentFactory = (Factory<Student>) createRegistory.buildPersonFactory("Student");
		Student s = (Student) buildStudentFactory.newInstance();
		s.setAge(20);
		s.setName("Jack");
		s.setRole("Student");
		
		System.out.println(s.toString());

		Factory<Teacher> buildTeacherFactory = (Factory<Teacher>) createRegistory.buildPersonFactory("Teacher");
		Teacher t = (Teacher) buildTeacherFactory.newInstance();
		t.setAge(20);
		t.setName("Jacks");
		t.setRole("Teacher");
		
		System.out.println(t.toString());

		Factory<Admin> buildAdminFactory = (Factory<Admin>) createRegistory.buildPersonFactory("Admin");
		Admin a = (Admin) buildAdminFactory.newInstance();
		a.setAge(20);
		a.setName("Jacky");
		a.setRole("Admin");
		
		System.out.println(a.toString());

	}

}
