package Assignments;
import java.util.Scanner;

public class Calculators {
	public static void main(String Args[])
	{
		Scanner sc =new Scanner(System.in);
		double number1,number2,operation;
		System.out.println("Enter the numbers");
		number1=sc.nextDouble();
		number2=sc.nextDouble();
		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.Multiplication");
		System.out.println("4.division");
		System.out.println("5.Exit");
		System.out.println("Choose your option");
		int choice=sc.nextInt();
		switch(choice)
		{
			case 1:operation=number1+number2;
			System.out.println("Addition of "+number1 +"and"+number2 +"is = "+operation);
			break;
			case 2:operation=number1-number2;
			System.out.println("Subtraction of "+number1 +"and"+number2 +"is = "+operation);
			break;
			case 3:operation=number1*number2;
			System.out.println("Multiplication of "+number1 +"and"+number2 +"is = "+operation);
			break;
			case 4:operation=number1/number2;
			System.out.println("division of "+number1 +"and"+number2 +"is = "+operation);
			break;
			case 5:break;
			case 6:System.out.println("you have entered wrong option");
		}
	}
}
