/*Given an array of integers, check whether all elements are unique.
 If any element repeats, print NO, otherwise print YES.*/
package arrayChallanges140126;

import java.util.Scanner;

public class Task2 {
	public static void main(String args[]) {
		Scanner read = new Scanner(System.in);
		
		//take size of the array
		System.out.print("Enter the size of the array = ");
		int size = read.nextInt();
		
		//create the array
		int[] arr = new int[size];
		
		//takek the array element
		System.out.print("Array = ");
		for(int i = 0; i < size; i++) {
			arr[i] = read.nextInt();
		}
		
		//logic
		boolean unique = false;
		for(int i = 0; i < size-1; i++) {
			if(arr[i] == arr[i+1]) {
				unique = true;
				break;
			}
		}
		
		if(unique) {
			System.out.println("Not Unique!");
		}else {
			System.out.println("Unique!");
		}
	}
}
