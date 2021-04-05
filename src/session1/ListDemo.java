package session1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListDemo {

	
	public static void main(String[] args) {
		
		System.out.println("------ARRAYS----------");
		String[] namesArr = new String[2];
		namesArr[0] = "Helen";
		namesArr[1] = "Harry";
		
		for (int i = 0; i < namesArr.length; i++) {
			System.out.println(namesArr[i]);
		}
		
		
		if (namesArr.length == 0) {
			System.out.println("Its empty");
		}else {
			System.out.println("Its not empty");
		}
		
	//	Check if Harry exist, we have to iterate our array	
//		for (int i = 0; i < namesArr.length; i++) {
//			if (namesArr[i] == "Harry") {
//				System.out.println(namesArr[i]);
//			}
//		}
				
		System.out.println(Arrays.toString(namesArr));
		System.out.println(namesArr[0] );
		System.out.println(namesArr.length);
		
		System.out.println("-------LIST------------");
		
		List<String> names = new ArrayList<>();
		
		names.add("Jack");
		names.add("Bob");
		names.add("Mary");
		names.add("Pete");
		
		System.out.println(names); //printing the contents of list
		System.out.println(names.get(0)); //getting a specific element from list
		System.out.println(names.size()); //getting size of a list
		
		//Check if Marry exists, we can use contains method which returns a boolean
		System.out.println(names.contains("Oliver")); //return false
		
		
		//isEmpty checks if the list is empty or not, return a boolean
		System.out.println(names.isEmpty());
		
		
		//indexOf(object) returns the index of that element, -1 if does not exist 
		System.out.println(names.indexOf("Kevin"));
		
		
//		System.out.println("Size of names list: " + names.size());
//		names.clear(); //clears all elements making the size 0
//		System.out.println("Size after clear() " + names.size());
		
		//remove an element by index
		names.remove(1);
		System.out.println(names);
		names.remove("Mary");
		System.out.println(names);
		
		names.add("Oliver");
		
		System.out.println(names);
	
		names.add(0, "Kevin");
		System.out.println(names);
		
		names.add(3, "Lance");
		System.out.println(names);
		
		//containsAll checks if multiple elements exist in the list
		boolean contains2Names = names.containsAll(Arrays.asList("Kevin","Pete","Oliver"));
		System.out.println(contains2Names);
		
		//set is used to update an element on a specific index from that list
		names.set( 3, "Oscar");
		System.out.println(names);
		
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}
		
		int count = 0;
		while(count < names.size()) {
			System.out.println(names.get(count));
			count++;
		}
	
		names.add("Pete");
		System.out.println(names);
	}
}
