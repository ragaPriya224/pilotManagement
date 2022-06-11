package sample.day8;

import java.util.ArrayList;
import java.util.Iterator;

public class CursorDemo {

	public static void main(String[] args) {


		ArrayList al = new ArrayList();
		al.add("ankit");
		al.add("purna");
		al.add("supriya");
		al.add("ganesh");
		al.add(5);

		Iterator i = al.iterator();
		System.out.println(i);
		while(i.hasNext()) {		
			if(i.next().equals(5)) {
				i.remove();
			}
		}
		System.out.println(al);
	}
}
