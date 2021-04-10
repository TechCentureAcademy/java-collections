package session2;

import java.util.ArrayList;
import java.util.List;


public class Recap {

	
	public static void main(String[] args) {
		
		//size is fixed
		String[] names = {"dsfasdf","sadfads","adsfdf"};
		
		List<String> myList = new ArrayList<>();
		
		myList.add("Jack"); //index 0
		myList.add("Henry"); //index 1
		myList.add("Bob");
		myList.add("Kevin");
		myList.add("Robert");
	
		System.out.println(myList);
		
		
		List<Integer> numbers  = new ArrayList<Integer>();
		numbers.add(12);
		numbers.add(76);
		numbers.add(546);
		
		
		List<Character> chars = new ArrayList<Character>();
		
		chars.add('T');
		 
		
		Car car1 = new Car("Honda", "Civic", 3434);
		Car car2 = new Car("Honda", "Civic", 3434);
		Car car3 = new Car("Honda", "Civic", 3434);
		Car car4 = new Car("Honda", "Civic", 3434);
		
//		//Car Array with fixed size of 4
//		Car[] cars = {car1,car2,car3,car4};
//		
//		Car car5 = new Car("Honda", "Civic", 3434);
//		
//		cars[4] = car5;
//		
//		Car[] newCarArr = new Car[cars.length+1];
//		
		List<Car> cars = new ArrayList<Car>();
		cars.add(car1);
		cars.add(car2);
		cars.add(car3);
		cars.add(car4);
		
	
		
		
		
		
		
		
	}
}
