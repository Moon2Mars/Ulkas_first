import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("**************");
System.out.println("Calaculator programm");
System.out.println("**************");

char operation;
int num1,num2, output;
Scanner input = new Scanner(System.in);
System.out.println("Enter first number");
num1 = input.nextInt();
System.out.println("Enter Operation: +, -, *, /, Modulus ");

operation = input.next().charAt(0);
System.out.println("Enter Second number");
num2 = input.nextInt();


switch (operation)
{	case'+':
	output = num1 + num2;
	System.out.println(num1+"+" + num2+"=" +output);
	break;
	case'-':
	output = num1 - num2;
	System.out.println(num1+"-" + num2+"=" +output);
	break;
	case'*':
		output = num1 * num2;
		System.out.println(num1+"*" + num2+"=" +output);
		break;
	case'/':
		output = num1 / num2;
		System.out.println(num1+"/" + num2+"=" +output);
		break;
	case'%':
		output = num1 % num2;
		System.out.println(num1+"%" + num2+"=" +output);
		break;
		
		
		default:
			System.out.println("Invalid operator");
			break;
}input.close();
	}

}
