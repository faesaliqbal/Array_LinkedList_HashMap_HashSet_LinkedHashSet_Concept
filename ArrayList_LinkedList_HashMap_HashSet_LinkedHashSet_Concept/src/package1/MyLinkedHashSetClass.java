package package1;

import java.util.LinkedHashSet;

public class MyLinkedHashSetClass {

	public static void main(String[] args) {
		
		/*
		 * LinkedHashSet
		 * The HashSet class does not automatically retain the order of the elements as they are added.
		 * To order the elements, use LinkedHashSet.
		 * LinkedHashSet maintains a linked list of the set's elements in the order in which they were inserted.
		 */
		
		//how to declare a LinkedHashSet
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		
		//how to add element in a LinkedHashSet
		set.add("A");
		set.add("H");
		set.add("Z");
		set.add("B");
		//trying to add a duplicate element in a LinkedHashSet would just overwrite it
		set.add("A");
		
		//how to display LinkedHashSet elements
		//LinkedHashSet maintains the order of the elements how they were added
		System.out.println("My set contains following elements: "+set);
		
		//how to get size of a LinkedHashSet
		System.out.println("Size of my LinkedHashSet is: "+set.size());

	}

}
