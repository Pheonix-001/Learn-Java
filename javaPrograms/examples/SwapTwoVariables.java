package javaPrograms.examples;
import java.util.*;
public class SwapTwoVariables {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter any two numbers:-");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		// num1 = 3
		// num2 = 4
		
		System.out.println("Before swaping value of num1 is "+num1+" and num2 is "+num2);
		
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		
		
		
		System.out.println("After swaping value of num1 is "+num1+" and num2 is "+num2);
	}

}
