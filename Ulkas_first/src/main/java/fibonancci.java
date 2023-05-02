import java.util.Scanner;
public class fibonancci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number");
		int num1= sc.nextInt();
		System.out.println("Enter the second number");
		int num2= sc.nextInt();
		System.out.println("Enter range");
		int range= sc.nextInt();
		System.out.print(num1);
		while(num2<range)
		{
			System.out.print(" "+num2+" ");
			int third= num1+num2;
			num1=num2;
			num2=third;
		}

				}

	}

				
			
	



