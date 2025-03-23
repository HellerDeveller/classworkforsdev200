import java.util.Scanner;

public class Exercise06_31 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Are you worthy?? Enter your credit card number! ");
		String number = input.nextLine();
		
		int count = number.length();
		if (count <= 16 && count >= 13) {
			int sum = 0;
			while (count != 0) {
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
			if (sum % 10 == 0) {
				System.out.println("Hehehe! You really ARE worthy! Thanks for your credit card, stud!!");
			}
			else {
				System.out.println("Aren't you just elaborate? Hehehe! Maybe next time, bring the REAL thing with you, hmmm?");
			}
		}
		else {
			System.out.println("Hehehe! I know a liar when I see one! That makes the two of us, hmmm?");
		}
	}
}