package package1;

import java.util.HashMap;

public class MyHashMapClass {

	public static void main(String[] args) {
		
		
		/*
		 * HashMap
		 * Arrays and Lists store elements as ordered collections, with each element given an integer index.
		 * HashMap is used for storing data collections as key and value pairs. One object is used as a key (index) to another object (the value).
		 * Note that the HashMap class is in the java.util package, so its necessary to import it before using it.
		 */
		
		//This is how to declare a HashMap
		HashMap<String, Integer> points = new HashMap<String, Integer>(); //keys type is String, value type is Integer
		
		//put method is used to add data.
		points.put("Amy", 154);
		points.put("Dave", 42);
		points.put("Rob", 733);
		points.put("Tom", 11);
		
		//HashMap can not contain duplicate keys.
		//Trying to add a new item with an already existing key would overwrite the old element.
		points.put("Amy", 89);
		
		//get method with the corresponding key as its input is used to access the HashMap element.
		System.out.println("The value for key Amy is: "+points.get("Amy")); //this would display value 89 that is for key "Amy"
		
		//trying to get a value that is not present in your map would return null
		System.out.println("The value for key Faisal is: "+points.get("Faisal")); //output would be null
		
		//containsKey method to check if the key exists or not
		System.out.println("Is Tom key present is this HashMap? "+points.containsKey("Tom"));
		
		//containsValue method to check if the value exists or not
		System.out.println("Is 11 value present in this HashMap? "+points.containsValue(11));

	}

}
