package simplePrograms.day10;

import java.util.TreeSet;

public class SortedSetDemo {

	public static void main(String[] args) {
		TreeSet markSet = new TreeSet();
		markSet.add(100);
		markSet.add(101);
		markSet.add(104);
		markSet.add(107);
		markSet.add(110);
		markSet.add(115);
		markSet.add(103);
		System.out.println(markSet);
		System.out.println(markSet.first());
		System.out.println(markSet.last());
		System.out.println(markSet.headSet(104));//LT than that
		System.out.println(markSet.tailSet(104));//GT than/equal
		System.out.println(markSet.subSet(103, 110));
	}

}
