package demo.day7;

import java.util.LinkedHashSet;

public class LinkedHashSeDemo {

	public static void main(String[] args) {
	LinkedHashSet  alphabetSet = new LinkedHashSet();
	alphabetSet.add("A");
	alphabetSet.add("C");
	alphabetSet.add("B");
	alphabetSet.add("Z");
	alphabetSet.add("a");
	alphabetSet.add("A");
	System.out.println(alphabetSet);
	}

}
