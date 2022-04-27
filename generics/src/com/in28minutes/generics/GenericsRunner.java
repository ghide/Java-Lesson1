
package com.in28minutes.generics;

public class GenericsRunner {

	// static <X> x doubleValue(x value) {
	// return value;
	// }

	public static void main(String[] args) {

		MyCustomList<String> list = new MyCustomList<>();
		list.addElement("Element 1");
		list.addElement("Element 2");
		String value = list.get(0);

		System.out.println(value);

		MyCustomList<Integer> list2 = new MyCustomList<Integer>();
		list2.addElement(Integer.valueOf(5));
		list2.addElement(Integer.valueOf(7));
		Integer number = list2.get(0);

		System.out.println(number);

	}
}