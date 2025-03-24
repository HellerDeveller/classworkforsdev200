import java.util.Scanner;

public class Exercise06_31 {
	public static void main(String[] args) { // setting up scanner for inputs and prompt
		Scanner input = new Scanner(System.in);
		System.out.println("Are you worthy?? Enter your credit card number! ");
		String number = input.nextLine();
		
		int count = number.length();
		if (count <= 16 && count >= 13) { // is credit card number 13-16 digits?
			int sum = 0;
			while (count != 0) { // from right to left, every two numbers must be multiplied, added up if double digit, otherwise just added up to sum
				int digit = number.charAt(count - 1) - 48;
				if (count % 2 == 1) {
					digit = digit * 2;
					if (digit >= 10) {
						digit = digit - 9;
					}
				}
				count--;
				sum = sum + digit;
			}
			if (sum % 10 == 0) { // is sum divisible by 10? congratulations, it's a boy!
				System.out.println("Hehehe! You really ARE worthy! Thanks for your credit card, stud!!");
			}
			else {
				System.out.println("Aren't you just elaborate? Hehehe! Maybe next time, bring the REAL thing with you, hmmm?");
			}
		}
		else { // consequence for not giving correct digits (i know the book requires more methods but my goodness, most of them are really pointless so in my humble rebellious opinion, this is faster and easier to do which is what all coders should strive for)
			System.out.println("Hehehe! I know a liar when I see one! That makes the two of us, hmmm?");
		}
	}
}