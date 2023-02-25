package arrayExercises;

import java.util.Scanner;

public class ArrayEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = new int[2][2];
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 2; j++)
			arr[i][j] = sc.nextInt();
		}
	}

}
