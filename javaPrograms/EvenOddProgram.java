package javaPrograms;
import java.util.Scanner;
public class EvenOddProgram {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any number:-");
		
		int num = sc.nextInt();
		
		if(num % 2 == 0)
		{
			System.out.println("Your number is Even");
		}
		else
		{
			System.out.println("Your number is Odd");
		}
		
	}

}
