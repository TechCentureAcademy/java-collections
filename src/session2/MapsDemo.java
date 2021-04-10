package session2;

import java.util.HashMap;
import java.util.Map;

public class MapsDemo {

	public static void main(String[] args) {
		
		Map<Integer, String> students = new HashMap<>();
		
		students.put(362, "Jack Reacher");
		students.put(23, "Hawk Nelson");
		students.put(86, "Pete Lawson");
		students.put(11, "Jack Reacher");
		String st = students.get(11);
		
	//	System.out.println(students);
		
		Map<String, Integer> studentGrades = new HashMap<String, Integer>();
		studentGrades.put("Oliver", 56);
		studentGrades.put("Pete", 89);
		studentGrades.put("Oliver", 100);
		studentGrades.put("oliver", 40);
		
	//	System.out.println(studentGrades);
		
		//    Key,   Value
		Map<Integer, Car> cars = new HashMap<Integer, Car>();
		cars.put(645434, new Car("Toyota", "Camry", 5000));
		cars.put(79767, new Car("Toyota", "Camry", 5000));
		cars.put(3435757, new Car("Toyota", "Camry", 3434));
		cars.put(865645, new Car("Toyota", "Camry", 3235));
		cars.put(223446, new Car("Toyota", "Camry", 57454));
		
		//get(K) method will accept a key and it returns a value
		Car car = cars.get(7667);
		
		System.out.println(car);
		
		Map<String, Boolean> m = new HashMap<>();
		
		
	}
}
