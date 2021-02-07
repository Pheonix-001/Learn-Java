package javaPrograms;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any value to find factorial");
		
		int num = sc.nextInt();
		int fct = 1;
		
		for(int i = 1; i <= num; i++)
		{
			fct = fct * i;
		}
		
		System.out.println("Factorial of given num is " + fct);

	}

}
