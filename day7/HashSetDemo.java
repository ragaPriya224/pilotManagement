package demo.day7;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet foodSet = new HashSet();
		foodSet.add("dosa");
		foodSet.add("briyani");
		foodSet.add("idli");
		foodSet.add("dosa");
		foodSet.add("chapathi");
		foodSet.add(123);
		foodSet.add(true);
		System.out.println(foodSet);

	}

}
