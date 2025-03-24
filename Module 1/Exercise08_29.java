import java.util.Scanner;
import java.util.Arrays;

public class Exercise08_29 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Watch me perform basic pattern recognition!");
		System.out.println("Enter 9 numbers!");
		int[][] list1 = new int[3][3];
		
		for (int row = 0; row < list1.length; row++) {
			for (int column = 0; column < list1[row].length; column++) {
				list1[row][column] = input.nextInt();
			}
		}

		System.out.println("Gimme another list of numbers!");
		int[][] list2 = new int[3][3];
		
		for (int row = 0; row < list2.length; row++) {
			for (int column = 0; column < list2[row].length; column++) {
				list2[row][column] = input.nextInt();
			}
		}
		
		if (equals(list1, list2) == true) {
			System.out.println("They are exactly the same, wow!! Please don't abandon me...");
		}
		else {
			System.out.println("Wow, these lists aren't the same!! I promise!!!");
		}
	}
	
	public static boolean equals(int[][] m1, int[][] m2) {
		if (Arrays.deepEquals(m1, m2) == true) {
			return true;
		}
		else {
			return false;
		}
	}
}