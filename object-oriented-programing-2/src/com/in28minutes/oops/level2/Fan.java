package com.in28minutes.oops.level2;

public class Fan {

	// State (member variables)
	// make means a brand name
	private String make;
	private double radius;
	private String color;
	private boolean isOn;
	// private boolean isOff;
	private byte speed; // 0 to 5


	// Creation/ what kind of constructors

	public Fan() {
		super();
	}

	public Fan(String make, double radius, String color) {
		this.make = make;
		this.radius = radius;
		this.color = color;

	}

	public void switchOn() {
		this.isOn = true;
		setSpeed((byte) 0);
	}

	public void switchOff() {
		this.isOn = false;
		setSpeed((byte) 0);
	}

	public void setSpeed(byte speed) {
		this.speed = speed;
	}

	// printing the state
	@Override
	public String toString() {

		return String.format("make: %s, radius: %f, color:%s, isOn : %b, speed- %d",

				make, radius, color, isOn, speed);
	}
}
