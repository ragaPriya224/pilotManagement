package demo.day7;

import java.util.HashMap;

public class MapDemo {

	public static void main(String[] args) {
		HashMap foodMap = new HashMap();
		foodMap.put("tea",15);
		foodMap.put("coffee",20);
//		System.out.println(foodMap);
		foodMap.put("coffee",50);
//		foodMap.clear();
//		foodMap.remove("coffee");
		System.out.println(foodMap.containsKey("milk"));
		System.out.println(foodMap.keySet());
		System.out.println(foodMap.containsValue(666));
		System.out.println(foodMap.get("coffee"));
		System.out.println(foodMap.values());
		System.out.println(foodMap.putIfAbsent("boost", 90));
		System.out.println(foodMap.entrySet());
		System.out.println(foodMap);
	}
}