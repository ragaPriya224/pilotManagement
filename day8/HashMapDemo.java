package sample.day8;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap foodMap = new HashMap();
		foodMap.put(101, "user");
		foodMap.put(105, "dev");
		foodMap.put(103, "tester");
//		System.out.println(foodMap);
//		System.out.println(foodMap.keySet());
//		System.out.println(foodMap.values());
//		System.out.println(foodMap.remove(105));
//		System.out.println(foodMap.isEmpty());
		foodMap.put(101, "briyani");
//		System.out.println("output is "+foodMap);
//		System.out.println(foodMap.containsKey(foodMap));
//		System.out.println(foodMap.containsValue("tester"));
		System.out.println(foodMap.putIfAbsent(102, "icecream"));
//		System.out.println(foodMap.get(105));
		System.out.println(foodMap.entrySet());
		System.out.println(foodMap.replace(102, "pizza"));
		System.out.println("output is "+foodMap);
	}

}
