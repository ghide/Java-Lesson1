package com.in28minutes.oops.level2;

public class StudentRunner {

	public static void main(String[] args) {
		Student student = new Student();
		student.setName("Ranga");
		student.setEmail("ghidehab2@gmail.com");

		Person person = new Person();
		person.setName("Ranga");
		person.setEmail("ghidehab2@gmail.com");
		person.setPhoneNumber("123-456-7890");
		String value = person.toString();
		System.out.println(value);
		System.out.println(person);
	}

}
