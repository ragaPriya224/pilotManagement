package demo.day7;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList foodList = new LinkedList();
		foodList.add("briyani");
		foodList.add("pizza");
		foodList.add("burger");
		foodList.add("pizza");
		foodList.add("briyani");
//		System.out.println(foodList);
		foodList.addFirst("chicken");
		foodList.addLast("samosa");
		System.out.println(foodList);

//		System.out.println(foodList.getFirst());
//		System.out.println(foodList.getLast());
		System.out.println(foodList.removeFirst());
		System.out.println(foodList.removeLast());
		System.out.println(foodList);

	}

}
