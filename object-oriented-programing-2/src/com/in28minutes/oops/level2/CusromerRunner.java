package com.in28minutes.oops.level2;

public class CusromerRunner {

	public static void main(String[] args) {

		Address homeAddress = new Address("line 1", "Boston", "50035");
		Customer customer = new Customer("Ranga", homeAddress);

		System.out.println(customer);

		Address workAddress = new Address("line 1 for work", "Boston", "50078");
		customer.setWorkAdress(workAddress);
		System.out.println(customer);
	}

}
