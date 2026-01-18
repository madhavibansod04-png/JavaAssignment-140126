/*You are given an array of integers.
 Write a Java program to count how many elements are greater than the first element of the array.
*/
package arrayChallanges140126;

import java.util.Scanner;

public class Task3 {
	public static void main(String args[]) {
		Scanner read = new Scanner(System.in);
		
		//take the size of the array
		System.out.print("Enter the size of the array = ");
		int size = read.nextInt();
		
		//create the array
		int[] arr = new int[size];
		
		//take the element as input
		System.out.print("Array = ");
		for(int i = 0; i < size; i++) {
			arr[i] = read.nextInt();
		}
		
		//logic
		int largeEle = 0;
		
		for(int i = 0; i < size; i++) {
			if(arr[0] < arr[i]) {
				largeEle++;
			}
		}
		System.out.println("Greater than first Element count = " +largeEle);
	}
}
