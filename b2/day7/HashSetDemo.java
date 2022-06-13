package demo.day7;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet alphabetSet = new HashSet();
		alphabetSet.add("A");
		alphabetSet.add("C");
		alphabetSet.add("B");
		alphabetSet.add("Z");
		alphabetSet.add("a");
		alphabetSet.add("A");
		alphabetSet.add(123);
		alphabetSet.add(false);
		System.out.println(alphabetSet);

	}

}
