package sample.day8;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet foodSet = new HashSet();
		foodSet.add("B");
		foodSet.add("Z");
		foodSet.add("a");
		foodSet.add("123");
		foodSet.add(56);

		System.out.println(foodSet.add("Z"));
		System.out.println(foodSet); //order we don't know
	}

}