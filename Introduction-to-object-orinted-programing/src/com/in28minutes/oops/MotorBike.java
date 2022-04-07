package com.in28minutes.oops;

public class MotorBike {

	private int speed; // instance variable or member variables

	MotorBike(int speed) {
		this.speed = speed;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}


	void start() {
		
		System.out.println("Bike should be started");


	}


	}

