package arrayExercises;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayEx3 {
	public static void main(String []args) {
		
		int[] arr = {3,4,6,7,10,3,9,15,17,17, -5, 10,7, -1, 21};
		Scanner sc = new Scanner(System.in);
		System.out.println("How many numbers to use(2, 3, or 4)? ");
		int n = sc.nextInt();
		findMatch(arr,20,n);
	}
	
	public static void findMatch(int[] list, int total, int numToUse){
		ArrayList<String> equations = new ArrayList<String>();
		System.out.print("The current list is: ");
		for(int i = 0; i < list.length; i++) {
			System.out.print(list[i] + " ");
		}
		System.out.println("\n"+ "Looking for numbers that combine for a total of: " + total);
		
		System.out.println("number of elements to use from list: " + numToUse);
		
		if(numToUse == 2) {
		for(int i = 0; i < list.length; i++) {
			int num1 = 0;
			int num2 = 0;
			num1 = list[i];
			for(int j = 1; j < list.length; j++) {
				num2=list[j];
				if(num1 + num2 == total) {
					equations.add(list[i] + " + " + list[j] + " = " + total);
					break;
				}
			}
		}
		
		for(int s = 0; s < equations.size(); s++) {
			String e1 = equations.get(s);
			String e2 = " ";
			for(int p = 0; p < equations.size(); p++) {
				e2 = equations.get(p);
				if(p > 0 && p != s && e2.equals(e1)) {
					equations.remove(p);
				}
			}
			
		}


		for(String s : equations) {
			System.out.println(s);
		}
	}
		if(numToUse == 3) {
			for(int i = 0; i < list.length; i++) {
				int num1 = 0;
				int num2 = 0;
				int num3 = 0;
				num1 = list[i];
				for(int j = 1; j < list.length; j++) {
					num2=list[j];
					for(int k = 2; k < list.length; k++) {
						num3 = list[k];
						if(num1 + num2 + num3 == total) {
							equations.add(list[i] + " + " + list[j] + " + " + list[k] + " = " + total);
							break;
						}
					}
					}
				}
			
			for(int s = 0; s < equations.size(); s++) {
				String e1 = equations.get(s);
				String e2 = " ";
				for(int p = 0; p < equations.size(); p++) {
					if(p>0) {
					e2 = equations.get(p);
					}
					if(p > 0 && p != s && e2.equals(e1)) {
						equations.remove(p);
					}
				}
				
			}


			for(String s : equations) {
				System.out.println(s);
			}
			
			}
		
		if(numToUse == 4) {
			for(int i = 0; i < list.length; i++) {
				int num1 = 0;
				int num2 = 0;
				int num3 = 0;
				int num4 = 0;
				num1 = list[i];
				for(int j = 1; j < list.length; j++) {
					num2=list[j];
					for(int k = 2; k < list.length; k++) {
						num3 = list[k];
						for(int m = 3; m < list.length; m++) {
							num4 = list[m];
							if(num1 + num2 + num3 + num4 == total) {
								equations.add(list[i] + " + " + list[j] + " + " + list[k] + " + " + list[m] + " = " + total);
								break;
							}
						}
					}
					}
				}
			
			for(int s = 0; s < equations.size(); s++) {
				String e1 = equations.get(s);
				String e2 = " ";
				for(int p = 0; p < equations.size(); p++) {
					e2 = equations.get(p);
					if(p > 0 && p != s && e2.equals(e1)) {
						equations.remove(p);
					}
				}
				
			}


			for(String s : equations) {
				System.out.println(s);
			}
			
			}
		
		
		
	}

}
