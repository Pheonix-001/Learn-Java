package javaPrograms;
import java.util.Scanner;
public class Table {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any number");
		
		int a =  sc.nextInt();
		int num;
		
		System.out.println("Table of given number is \n");
		
		for(int i = 1; i<=10; i++)
		{
			num = a * i;
			System.out.println(num);
		}
		

	}

}
