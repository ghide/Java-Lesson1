
package com.in28minutes.generics;

import java.util.ArrayList;

public class MyCustomList<T> {

	ArrayList<T> list = new ArrayList<>();

	public void addElement(T element) {
		list.add(element);
	}

	public void removeElement(T elements) {
		list.remove(elements);

	}

	@Override
	public String toString() {
		return list.toString();
	}

	public T get(int idex) {

		return list.get(idex);
	}
}