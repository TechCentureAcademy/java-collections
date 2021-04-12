package session3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapsDemo {

	
	public static void main(String[] args) {
		
		/**
		 * Keys in maps are always unique, if you use the same key
		 * multiple times, the last entry will override the previous one
		 */
		
		Map<String, Double> salaries = new HashMap<>();
		
		salaries.put("Sal", 64544.78);
		salaries.put("Pete", 10000.45);
		salaries.put("Ric", 122425.8);
		salaries.put("Rose", 5453.989);
		
		
//		double ricsSalary = salaries.get("Tom"); will throw exception
		
//		System.out.println(salaries); //json format
		
		//remove method accepts the key, and returns the value
		salaries.remove("Rose");
		
//		System.out.println(salaries);
		
		Map<String, Integer> people = new HashMap<>();
		people.put("Tom", 56);
		people.put("Bob", 40);
		people.put("casey", 67);
		people.put("Hillary", 28);
		people.put("Sherry", 60);
		people.put("Connor", 39);
		people.put("Oliver", 21);
		
		
		System.out.println("People over 40");
		for(Map.Entry<String, Integer> person  : people.entrySet() ) {
			
			Integer age = person.getValue();
			if (age >= 40) {
				System.out.println(person.getKey() + " " + age);
			}
		}
		
		System.out.println("\nPeople with names starting with C");
		for(Map.Entry<String, Integer> person  : people.entrySet() ) {
			
			String name = person.getKey();
			if (name.toLowerCase().startsWith("c")) {
				System.out.println(name + " aged " + person.getValue());
			}
		}
		
		System.out.println("Size is: " + people.size());
		
//		
//		List<Integer> ages = Arrays.asList(1,2,3,4,5);
//		
//		for( Integer a   : ages ) {
//			System.out.println(a);
//		}
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
