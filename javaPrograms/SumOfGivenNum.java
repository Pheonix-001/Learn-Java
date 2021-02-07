package javaPrograms;
import java.util.Scanner;
public class SumOfGivenNum {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter value of A to find sum of 1 to A");
		int A = input.nextInt();
		int sum = 0;
//		int A = 5;
		
		for(int i = 1; i <= A; i++)
		{
			sum = sum + i;
		}
		
		System.out.println(sum);

	}

}
