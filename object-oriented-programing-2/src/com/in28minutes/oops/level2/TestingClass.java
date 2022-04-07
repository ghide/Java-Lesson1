package com.in28minutes.oops.level2;

public class TestingClass {
	Fan fan = new Fan();

	public static void main(String[] args) {
		TestingClass test = new TestingClass();
		String manufacture = "Toyota";
		int age = 35;
		System.out.println(manufacture + ", " + age);
		test.getFan();
		getFanStatic();
		// fan = getFan();
		// System.out.println(fan);
	}

	public String getFan() {
		// System.out.println(" Nothing to do.");

		fan.switchOn();

		fan.setSpeed((byte) 5);

		fan.switchOff();
		System.out.println(fan);

		return fan.toString();
	}

	public static String getFanStatic() {
		// System.out.println(" Nothing to do.");

		return "String";
	}

}
