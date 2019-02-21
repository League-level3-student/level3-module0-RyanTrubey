package _03_More_Array_Fun;

import java.util.Random;

public class MoreArrayFun {
	//1. Create a main method to test the other methods you write.
	static String[] strings = {"asdf", "ljk", "string", "this is a string"};
	public static void main(String[] args) {
		printStrings(strings);
		reverseStrings(strings);
		everyOtherString(strings);
		randomStrings(strings);
	}
	
	
	//2. Write a method that takes an array of Strings and prints all the Strings in the array.
	public static void printStrings(String[] strings) {
		System.out.println(" ");
		for(int i = 0; i < strings.length; i++) {
			System.out.print(strings[i] + " ");
		}
	}
	
	
	//3. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in reverse order.
	public static void reverseStrings(String[] strings) {
		System.out.println(" ");
		for(int i = strings.length-1; i >= 0; i--) {
			System.out.print(strings[i] + " ");
		}
	}
	
	
	//4. Write a method that takes an array of Strings and prints every other String in the array.
	public static void everyOtherString(String[] strings) {
		System.out.println(" ");
		for(int i = 0; i < strings.length; i+=2) {
			System.out.print(strings[i] + " ");
		}
	}
	
	//5. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in a completely random order. Almost every run of the program should result in a different order.
	public static void randomStrings(String[] strings) {
		System.out.println(" ");
		Random r = new Random();
		for(int i = 0; i < strings.length; i++) {
			int random = r.nextInt(strings.length);
			System.out.print(strings[random] + " ");
		}
	}
}
