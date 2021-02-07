package javaPrograms;
import java.util.Scanner;
public class FibonacciNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any number to find fabonacci of given number:-");
		
		int num = sc.nextInt();
		int a = 0;
		int b = 1;
		
		System.out.print(a);
		System.out.print(" " +b);
		
		for(int i = 0; i < num-2; i++) 
		{
			int c = a + b;
			
			System.out.print(" "+c);
			
			a = b;
			b = c;
			
			
		}
		
		
	}
}
