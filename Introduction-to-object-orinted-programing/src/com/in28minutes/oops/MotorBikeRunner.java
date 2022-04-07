package com.in28minutes.oops;

public class MotorBikeRunner {

	public static void main(String[] args) {
		MotorBike ducati = new MotorBike(100);
		MotorBike honda = new MotorBike(200);
		System.out.println(ducati.getSpeed());
		System.out.println(honda.getSpeed());

		// member varibale

		ducati.start();
		honda.start();

		ducati.setSpeed(100);

		int ducatiSpeed = ducati.getSpeed();
		ducatiSpeed = ducatiSpeed + 100;
		ducati.setSpeed(ducatiSpeed);

		System.out.println(ducati.getSpeed());

		honda.setSpeed(80);

		System.out.println(honda.getSpeed());
	}
}