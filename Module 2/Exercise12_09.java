/* UML MOCKUP
class: Exercise12_09 (main)
+ prints and tests strings
+ bin2Dec(binary): string

class: BinaryFormatException -> Exception
+ BinaryFormatException(): string
*/

public class Exercise12_09 { // the main show
	public static void main(String[] args) { // test strings for the bin2Dec method
		String bin1 = "0110100001101001";
		String bin2 = "straight up jorking it";
		String bin3 = "0110010101110111";
		
		System.out.println(bin2Dec(bin1));
		System.out.println(bin2Dec(bin2));
		System.out.println(bin2Dec(bin3));
	}

	
	public static String bin2Dec(String binary) { // does the converting
		try {
			if(binary.contains("0") != true && binary.contains("1") != true) { // error check
				throw new BinaryFormatException();
			}
			else {
				return binary + " can-a convert!"; // pretend this converts to decimal...
			}
		}
		
		catch(BinaryFormatException ex) { // the error message in question
			return "That mf string (" + binary + ") is non-binary as heeeellllllll!!"; // if i have to apologize...
		}
	}
}

class BinaryFormatException extends Exception { // custom error/exception message
	public BinaryFormatException() {}
	
	public BinaryFormatException(String message) {
		super(message);
	}
}