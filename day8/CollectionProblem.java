package sample.day8;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class CollectionProblem {

	public static void main(String[] args) {
		String name = "amansachan";
		char[] charArray = name.toCharArray();
		HashMap<Character,Integer> characterMap = new HashMap();
		for(char c : charArray){
			if(characterMap.containsKey(c)) {
				characterMap.put(c, characterMap.get(c)+1);
			}else {
				characterMap.put( c, 1);
			}
		}
		System.out.println(characterMap);

		Set<Entry<Character, Integer>> data = characterMap.entrySet();

		for(Entry<Character, Integer> cData :data ){
			if(cData.getValue()> 1) {
				System.out.println("duplicte is :" +cData);
			}
		}
	}

}