/*An array is said to be a palindrome if it reads the same from left to right and right to left.
 Write a Java program to check whether the given array is a palindrome.*/
package arrayChallanges140126;

import java.util.Scanner;

public class Task4 {
	public static void main(String args[]) {
		Scanner read = new Scanner(System.in);
		
		//take the size of the array
		System.out.print("Enter the size of the array = ");
		int size = read.nextInt();
		
		//create the array
		int[] arr = new int[size];
		
		//take the elements as input
		System.out.print("Array = ");
		for(int i = 0; i < size; i++) {
			arr[i] = read.nextInt();
		}
		
		//logic ->arr[i] == arr[size-i]
		//size 4 -> arr[0] = arr[4] -> arr[1] = arr[3]
		
		boolean palindrome = false;
		
		for(int i = 0; i <= size; i++) {
			if(arr[i] == arr[size - i]) {
				palindrome = true;
			}
		}
		
		if(palindrome) {
			System.out.println("Palindrome Array");
		}else {
			System.out.println("Not a Palindrome Array");
		}
	}
}
