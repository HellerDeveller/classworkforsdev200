import java.util.Scanner;
import java.util.Arrays;

public class Exercise08_29 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); //import da scanner for inputs and give prompt, the usual
		System.out.println("Watch me perform basic pattern recognition!");
		System.out.println("Enter 9 numbers!");
		
		int[][] list1 = new int[3][3]; //create list one and have user input each number
		for (int row = 0; row < list1.length; row++) {
			for (int column = 0; column < list1[row].length; column++) {
				list1[row][column] = input.nextInt();
			}
		}

		System.out.println("Gimme another list of numbers!"); //same as before but with list two
		int[][] list2 = new int[3][3];
		for (int row = 0; row < list2.length; row++) {
			for (int column = 0; column < list2[row].length; column++) {
				list2[row][column] = input.nextInt();
			}
		}
		
		if (equals(list1, list2) == true) { //uses 'equals' method as decider for message
			System.out.println("They are exactly the same, wow!! Please don't abandon me...");
		}
		else {
			System.out.println("Wow, these lists aren't the same!! I promise!!! Please don't be mad at me...");
		}
	}
	
	public static boolean equals(int[][] m1, int[][] m2) { //method to check if lists are same
		if (Arrays.deepEquals(m1, m2) == true) {
			return true;
		}
		else {
			return false;
		}
	}
}