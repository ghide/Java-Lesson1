package com.in28minutes.oops.level2;

public class Customer {

	// State
	private String name;
	private Address homeAddress;
	private Address workAddress;

	// Creating / constructor

	public Customer(String name, Address homeAddress) {
		this.name = name;
		this.homeAddress = homeAddress;

	}

	public Address getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}

	public Address getWorkAdress() {
		return workAddress;
	}

	public void setWorkAdress(Address workAddress) {
		this.workAddress = workAddress;
	}

	@Override
	public String toString() {
		return String.format("name -[%s] home address -[%s] work address- [%s]", name, homeAddress, workAddress);
	}

}
