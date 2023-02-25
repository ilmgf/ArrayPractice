package arrayExercises;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[6];
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < 6; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print("Starting Array: ");
		for(int j = 0; j < arr.length; j++) {
			System.out.print(arr[j] + " ");
		}
		retainPositiveNumbers(arr);
	}
	
	//RETURNS POSITIVE #S ONLY IN ASCENDING ORDER
	public static int[] retainPositiveNumbers(int[] a) {
		//count number of positive numbers
		int count = 0;
		for(int k = 0; k < a.length; k++) {
			if(a[k] > 0)
				count++;
		}
		//Make length of new array the count of positive numbers
		int[] newArray = new int[count];
		
		//Enter positive numbers into new array
		int count2 = 0;
		for(int i = 0; i < a.length; i++) {
				if(count2 == count) {
					break;
				}
				else if(a[i] > 0) {
					newArray[count2] = a[i];
					count2++;
				}
			}
		
		//PUTS NEW ARRAY INTO ASCENDING ORDER
		Arrays.sort(newArray);
		
		System.out.print("\n" + "Positive Only: ");
		for(int j = 0; j < newArray.length; j++) {
			System.out.print(newArray[j] + " ");
		}
		
		return newArray;
	}

}
