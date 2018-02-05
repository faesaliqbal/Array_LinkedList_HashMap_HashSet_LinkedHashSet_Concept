package package1;

import java.util.LinkedList;

public class MyLinkedListClass {

	public static void main(String[] args) {
		
		/*
		 * LinkedList
		 * The LinkedList is very similar in syntax to the ArrayList.
		 * You can easily change an ArrayList to a LinkedList by changing the object type.
		 * You can not specify an initial capacity for the LinkedList.
		 * Note that the LinkedList class is in the java.util package, so its necessary to import it before using it.
		 */
		LinkedList<String> colors = new LinkedList<String>();
		colors.add("red");
		colors.add("green");
		colors.add("blue");
		colors.add("black");
		System.out.println("following colors are added in the list: "+colors);
		colors.remove("black");
		System.out.println("after removal, these are the colors present: "+colors);
		
		/*
		 * Difference between ArrayList and LinkedList:
		 * The most notable difference is in the way both store objects.
		 * ArrayList is better for storing and accessing data, as it is very similar to a normal array.
		 * LinkedList is better for manipulating data, such as making numerous inserts and deletes.
		 * In addition to storing the objects, LinkedList stores the memory address (or link) of the element that follows it.
		 * It's called LinkedList because each element contains a link to the neighboring element.
		 */
		
		
		 //You can use the enhanced for loop to iterate over its elements.
		 for(String a: colors){
			 System.out.println(a);
		 }
		 
		 /*
		  * ArrayList or LinkedList, which one to use?
		  * Use an ArrayList when you need rapid access to your data.
		  * Use a LinkedList when you need to make a large number of inserts and/or delete.
		  */


	}

}
