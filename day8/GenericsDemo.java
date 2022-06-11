package sample.day8;

import java.util.ArrayList;
import java.util.TreeSet;

public class GenericsDemo {

	public static void main(String[] args) {
		TreeSet<String> foodSet = new TreeSet<String>();
		foodSet.add("idli");
		foodSet.add("burger");
		foodSet.add("paneer");
//		foodSet.add(12);

		int[] marks = new int[5];
		marks[2] = 55;
		marks[1] = 22;
		marks[3] = 15;
//		marks[0] ="paneer";
	}

}
