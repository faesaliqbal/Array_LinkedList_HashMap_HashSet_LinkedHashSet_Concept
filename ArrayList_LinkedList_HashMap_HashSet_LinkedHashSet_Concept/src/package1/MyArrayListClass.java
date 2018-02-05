package package1;

import java.util.ArrayList;

public class MyArrayListClass {

	public static void main(String[] args) {
		
		/*
		 * ArrayList
		 * The Java API provides special classes to store and manipulate groups of objects.
		 * One such class is the ArrayList.
		 * Standard Java arrays are of fixed length, which means that after they are created, they can not expand or shrink.
		 * On the other hand, ArrayLists are created with an initial size, but when this size is exceeded, the collection is automatically enlarged.
		 * When objects are removed, the ArrayList may shrink in size.
		 * Note that the ArrayList class is in the java.util package, so its necessary to import it before using it.
		 */
		
		
		 //This is how an ArrayList is created.
		ArrayList colors = new ArrayList();
		
		//You can optionally specify a capacity and type of objects the ArrayList will hold.
		//This defines an ArrayList of Strings with 10 as its initial size.
		ArrayList<String> colors1 = new ArrayList<String>(10);
		
		
		/*
		 * ArrayList store objects.
		 * Thus, the type specified must be a class type.
		 * You can not pass, for example, int as the objects' type.
		 * Instead, use the special class types that correspond to the desired value type, such as Integer for int, Double for double, and so on.
		 */
		//ArrayList<int> myArrayList = new ArrayList<int>(10); //This is invalid
		ArrayList<Integer> myArrayList = new ArrayList<Integer>(10); //This is valid
		//ArrayList<double> myArrayList1 = new ArrayList<double>(10); //This is invalid.
		ArrayList<Double> myArrayList1 = new ArrayList<Double>(10);
		
		
		/*
		 * The ArrayList class provides a number of useful methods for manipulating its objects.
		 * add() method adds new objects to the ArrayList.
		 * remove() methid removes objects from the ArrayList.
		 */
		colors1.add("red");
		colors1.add("green");
		colors1.add("blue");
		colors1.add("black");
		System.out.println("following colors are added in the list: "+colors1);
		colors1.remove("black");
		System.out.println("after removal, these are the colors present: "+colors1);
		
		//You can use the enhanced for loop to iterate over its elements.
		for(String a: colors1){
			System.out.println(a);
		}

		
		/*
		 * Some other useful methods:
		 * contains(): returns true if the list contains the specified element.
		 * get(int index): returns the element at the specified position in the list.
		 * size(): returns the number of elements in the list.
		 * clear(): removes all of the elements from the list.
		 */
		
		/*
		 * Please note that as with arrays, the indexing in ArrayList starts with 0.
		 */
		System.out.println("Is red color present in the list? "+colors1.contains("red")); //output should be true
		System.out.println("The color at index# 2 is: "+colors1.get(2)); //output should be blue
		System.out.println("Size of this ArrayList is: "+colors1.size()); //output should be 3 as black color had been removed
		colors1.clear(); //all the elements would be removed
		System.out.println("After clearing, the list size is now: "+colors1.size()); //output should be 0
	}

}
