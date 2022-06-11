package sample.day8;

import java.util.TreeSet;

public class SortedSetDemo {

	public static void main(String[] args) {
		//methods specific
		//		first,last, headset, tailset, subset, comparator
		TreeSet dataSet =new TreeSet();
		dataSet.add(100);
		dataSet.add(101);
		dataSet.add(104);
		dataSet.add(107);
		dataSet.add(110);
		dataSet.add(115);
		dataSet.add(103);
		System.out.println(dataSet);
		System.out.println(dataSet.first());
		System.out.println(dataSet.last());
		System.out.println(dataSet.headSet(104)); //LT
		System.out.println(dataSet.tailSet(104));  //GT
		System.out.println(dataSet.subSet(103, 110));
	}

}
