/* UML MOCKUP
class: Exercise20_11 (main)
+ where the entire code happens because I'm lazy

class: StackExample
+ filler class for testing this
*/
import java.util.*;
import java.io.*;

public class Exercise20_11 {
	public static void main(String[] args) {
		try { // try is required for file reading
			File a = new File("Exercise20_11.java"); // put whatever java file you want tested here
			Scanner b = new Scanner(a);
			boolean check = false; // boolean to output the result message
			ArrayList<String> list = new ArrayList<String>(); // list that keeps track of all the parenthesis
			while (b.hasNextLine()) {
				String data = b.nextLine();
				System.out.println(data); // prints each line
			
				for (int i = 0; i < data.length(); i++) { // adds parenthesis to the list
					char p = data.charAt(i);
					String txt = Character.toString(p);
					
					if (txt.matches("\\(|\\[|\\{|\\}|\\]|\\)")) {
						list.add(txt);
					}
				}
			}

			System.out.println(list);
			while (list.isEmpty() == false && list.size() % 2 != 1) { // checks if each parenthesis matches with correct pair and is not odd (imma be real, this thing needs work)
				if (list.get(0) == list.get(list.size() - 1)) {
					list.remove(0);
					list.remove(list.size() - 1);
					check = true;
				}
				else {
					check = false;
					break;
				}
			}
		b.close();
		if (check == false) { // outputs result
			System.out.println("DUDE!!! These pairs do NOT work!!");
		}
		else {
			System.out.println("You did good son :D");
		}
		
		} catch (FileNotFoundException e) { // file exception error (shouldn't be getting this, that's on you)
			System.out.println("ERROR!!");
			e.printStackTrace();
		}
	}
}

class StackExample { // a class that exists just for testing this program, please ignore everything about it!
	public void ignore() {
		Stack<String> stack = new Stack<>();

		stack.push("jack");
		stack.push("john");
		stack.push("jacob");

		System.out.println("Before Pop");

		System.out.println(stack);

		stack.pop();

		System.out.println("After Pop");

		System.out.println(stack);
	}
}
