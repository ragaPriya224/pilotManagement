package simplePrograms.day10;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet t = new TreeSet();
		t.add("A");
		t.add("a");
		t.add("B");
		t.add("Z");
		t.add("B");
		t.add("L");
		t.add(true);
		//t.add(null);
		System.out.println(t);
	}

}