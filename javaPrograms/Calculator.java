package javaPrograms;
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = 0;
		
		String sum = "+";
		String sub = "-";
		
		switch(sum)
		{
		case "+" :
			c = a + b;
//			break;
		case "-" :
			c = a - b;
			break;
		}

		System.out.println(c);
		
	}

}
