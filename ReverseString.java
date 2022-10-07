import java.util.InputMismatchException;
import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		String text = "";
		System.out.println("--- Reverse String ---");
		System.out.println("Enter text: ");
		try (Scanner scanner = new Scanner(System.in)) {
			try {
				text = scanner.nextLine();
				System.out.println(reverseString(text));
			} catch (InputMismatchException e) {
				System.out.println("Is not a string");
			}
		}
		
	}
	public static String reverseString(String s) {
		String result = "";
		for (int i = 0; i < s.length(); i++) {
		    result += s.charAt(s.length() - i - 1);
		}
		return result;
		}
}
