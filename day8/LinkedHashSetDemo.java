package sample.day8;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		LinkedHashSet foodSet = new LinkedHashSet();
		foodSet.add("B");
		foodSet.add("Z");
		foodSet.add("a");
		foodSet.add("123");
		foodSet.add(56);

		System.out.println(foodSet.add("Z"));
		System.out.println(foodSet); //order we don't know
	}

}