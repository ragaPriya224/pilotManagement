package simplePrograms.day10;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet foodSet = new HashSet();
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
