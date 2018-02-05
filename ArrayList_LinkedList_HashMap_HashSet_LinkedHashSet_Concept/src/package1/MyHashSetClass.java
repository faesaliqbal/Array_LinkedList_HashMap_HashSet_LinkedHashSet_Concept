package package1;

import java.util.HashSet;

public class MyHashSetClass {

	public static void main(String[] args) {
		
		/*
		 * What is hashing?
		 * A hash table stores information through a mechanism called hashing.
		 * In hashing, a key's information content is used to determine a unique value called a hash code.
		 * So basically, each element is the HashSet is associated with its unique hash code.
		 */

		
		/*
		 * HashSet
		 * A set is a collection that can not contain duplicate elements.
		 * It models the mathematical set abstraction.
		 * One of the implementations of the Set is the HashSet class.
		 */
		
		//how to declare a HashSet
		HashSet<String> set = new HashSet<String>();
		
		//how to add element in a HashSet
		set.add("A");
		set.add("H");
		set.add("Z");
		set.add("B");
		//trying to add a duplicate element in a HashSet would just overwrite it
		set.add("A");
		
		//how to display HashSet elements
		//HashSet does not maintain the order of the elements how they were added
		System.out.println("My set contains following elements: "+set);
		
		//how to get size of a HashSet
		System.out.println("Size of my HashSet is: "+set.size());

	}

}
