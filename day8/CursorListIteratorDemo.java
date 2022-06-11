package sample.day8;

import java.util.LinkedList;
import java.util.ListIterator;

public class CursorListIteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stubsdjkfjsedkfjlskdfjk
		LinkedList list = new LinkedList();
		list.add("A");
		list.add("B");
		list.add("C");
		ListIterator listIterator = list.listIterator();
		listIterator.add("D");
		while(listIterator.hasNext()) {
			System.out.println("***");
			if(listIterator.next().equals("C")){
				listIterator.set("Z");
			}
		}

		System.out.println(list);
	}



	//split iterator -> parallel 
}

//iterator -> hasnext, next, remove . forward dirction 
//no replace, no add 

//ListIterator
//next, previous...
//bidirectional
//read, remove, replace add new object
