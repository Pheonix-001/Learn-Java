package conditionalStatement;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any number");
		int a = sc.nextInt();
		
		switch(a) {
		case 1:
			System.out.println("I am in first case");
			break;
		case 2:
			System.out.println("I am in second case");
		case 3:
			System.out.println("I am in third case");
			break;
		default:
			System.out.println("You Entered a wrong number");
		}

	}

}
