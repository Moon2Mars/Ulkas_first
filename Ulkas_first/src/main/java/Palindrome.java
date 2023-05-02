import java.util.*;

public class Palindrome {

	public static void main(String[] args) {

		String original, reverse = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String to check:");
		original = sc.next();
		int len = original.length();
		for (int pos = len - 1; pos >= 0; pos--) {

			{
				reverse = reverse + original.charAt(pos);
			}
			if (original.equals(reverse)) {
				System.out.println("A string is Palindrome" + original);

			} else {
				System.out.println("Not a Palindrome");
			}
		}
	}
}