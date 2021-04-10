package session2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Vector;

public class SetsDemo {

	
	public static void main(String[] args) {
	
		
		System.out.println("===========HashSet===============");
		Set<String> names = new HashSet<String>();
		
		names.add("Sam");
		names.add("Richard");
		names.add("David");
		names.add("Mike");
		names.add("Pete");
		names.add("Sam");
		names.add("Sam");
		names.add("Pete");
		
		System.out.println(names);
		//advanced for loop
//		for (String n : names) {
//			System.out.println(n);
//		}
	
		
		Set<Integer> grades = new HashSet<>();
		grades.add(232);
		grades.add(232);
		grades.add(1);
		grades.add(4);
		grades.add(46);
		grades.add(3);
		grades.add(6);
		
	//	System.out.println(grades);
		
		
		
		System.out.println("==========LInked HashSet ===============");
		Set<String> linked = new LinkedHashSet<>();
		linked.add("Sam");
		linked.add("Richard");
		linked.add("David");
		linked.add("Mike");
		linked.add("Pete");
		linked.add("Sam");
		linked.add("Sam");
		linked.add("Pete");
		
		
		System.out.println(linked);
		
		
		System.out.println("===========Sorted Tree Set===============");
		SortedSet<String> sorted = new TreeSet<String>();
		
		sorted.add("Zorro");
		sorted.add("Hulk");
		sorted.add("Doctor Strange");
		sorted.add("Doctor Strange");
		sorted.add("Thanos");
		
		System.out.println(sorted);
		
		SortedSet<Integer> nums = new TreeSet<Integer>();
		nums.add(646);
		nums.add(34);
		nums.add(9787);
		nums.add(-12);
		nums.add(-12);
		System.out.println(nums);
		
	}
}
