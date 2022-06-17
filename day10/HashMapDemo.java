package simplePrograms.day10;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<String, Integer> foodMap = new HashMap<String, Integer>();
		foodMap.put("dosa", 50);
	
		foodMap.put("idli",20);
		foodMap.put("burger",50);
		foodMap.put("dosa", 600);

		System.out.println(foodMap.size());
		System.out.println(foodMap.containsKey("burger"));
		System.out.println(foodMap.containsValue("123"));
		System.out.println(foodMap.get("dosa"));
		System.out.println(foodMap.keySet());
		System.out.println(foodMap.values());
		System.out.println(foodMap.replace("idli", 5));
		foodMap.putIfAbsent("burger", 200);
		System.out.println(foodMap.entrySet());
		System.out.println(foodMap);

	}

}
