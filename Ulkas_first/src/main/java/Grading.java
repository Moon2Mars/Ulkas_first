import java.util.*;

public class Grading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Grading system for Marks");
		System.out.println("Enter Students Name");
		Scanner input = new Scanner(System.in);
		String Name = input.next();
		System.out.println("Enter marks");

		Float Marks, Grade;
		Marks = input.nextFloat();
		if (Marks >= 90) {
			System.out.println("A Grade");

		} else if (Marks >= 80) {
			System.out.println("B Grade");
		} else if (Marks >= 70) {
			System.out.println("C Grade");
		} else if (Marks >= 60) {
			System.out.println("D Grade");
		} else {
			System.out.println("Student needs Remedial");
		}
	}
}
