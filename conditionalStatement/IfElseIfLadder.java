package conditionalStatement;
import java.util.Scanner;
public class IfElseIfLadder {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your Marks:-");
		int num = sc.nextInt();
		
		if(num<17)
		{
			System.out.println("You are fail");
		}
		else if(num>=17 && num<=40)
		{
			System.out.println("You are Third Division.");
		}
		else if(num>40 && num<=60)
		{
			System.out.println("You are Second Division.");
		}
		else
		{
			System.out.println("You are First Division.");
		}
	}
}