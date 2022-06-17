package simplePrograms.day10;

import java.util.HashMap;

public class CollectionProblem {

	public static void main(String[] args) {
		String name = "sarath";
		char[] charArray = name.toCharArray();
		HashMap<Character,Integer> characterMap = 
				new HashMap<Character,Integer>();
		for(char c : charArray){
			if(characterMap.containsKey(c)) {
				characterMap.put(c, characterMap.get(c)+1);

			}else {
				characterMap.put(c, 1);
			}
			
		}
		System.out.println(characterMap);

	}

}
