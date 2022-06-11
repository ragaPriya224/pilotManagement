package sample.day8;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet t = new TreeSet();
		t.add("A");
		t.add("a");
		t.add("B");
		t.add("Z");
		t.add("L");
		System.out.println(t); // we can predict the output
//		t.add(new Integer(10));
		t.add(null);
	}

}
