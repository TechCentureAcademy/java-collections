package session3;

import java.util.HashMap;
import java.util.Map;

public class MapsChallenge {

	
	
	public static void main(String[] args) {
		
		
		eachCharOccurence("aaaaab");
		
	}									
	
	
	public static void eachCharOccurence(String input) {
		
		Map<Character, Integer> map = new HashMap<>(); // {}
		for (int i = 0; i < input.length(); i++) {
			Character c = input.charAt(i); //
			if (map.containsKey(c)) {
				Integer value = map.get(c);
				map.put(c, value+1);
			}else {
				map.put(c, 1);
			}
		}
		System.out.println(map);
	}
	

}
