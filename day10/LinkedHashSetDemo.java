package simplePrograms.day10;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		LinkedHashSet foodSet = new LinkedHashSet();
		foodSet.add("dosa");
		foodSet.add("burger");
		foodSet.add("pizza");
		foodSet.add("juice");
		foodSet.add("burger");
		foodSet.add("icecream");
		foodSet.add(123);
		foodSet.add(true);
		System.out.println(foodSet);

	}

}
