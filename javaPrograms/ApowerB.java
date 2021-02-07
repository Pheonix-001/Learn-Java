package javaPrograms;

import java.util.Scanner;

public class ApowerB {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = 0;
	
	for(int i = 0; i <= b; i++)
	{
//		i = b;
		c = a * a;
	}
	
	System.out.println(c);
	

	}

}
