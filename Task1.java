/*You are given an array of integers representing daily profit and loss values.
Write a Java program to count:
Number of positive values
Number of negative values
Number of zero values*/

package arrayChallanges140126;

import java.util.Scanner;

public class Task1 {
	public static void main(String args[]) {
		Scanner read = new Scanner(System.in);
		
		//take the size of the array
		System.out.print("Enter the size of the array = ");
		int size = read.nextInt();
		
		//create the array
		int[] arr = new int[size];
		
		//take element as input
		System.out.print("Array = ");
		for(int i = 0; i < size; i++) {
			arr[i]= read.nextInt();
		}
		
		//logic of program
		int positive = 0;
		int negative = 0;
		int zero = 0;
		
		for(int i = 0; i < size; i++) {
			if(arr[i] > 0) {
				positive++;
			}else if(arr[i] < 0) {
				negative++;
			}else if(arr[i] == 0) {
				zero++;
			}
		}
		
		System.out.println("Positive = " +positive);
		System.out.println("Negative = " +negative);
		System.out.println("Zreo = " +zero);
	}
}

class ArraySizeExp extends RuntimeException{
	public ArraySizeExp(String msg) {
		super(msg);
	}
}
