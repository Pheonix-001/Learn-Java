package conditionalStatement;
import java.util.Scanner;		//max of three numbers
public class NestedIfElse {

	public static void main(String[] args) {
		
		System.out.println("Enter any numeber:-");
		Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
	
		if(a>b)
		{
			if(a>c)
			{
				System.out.println("greater number is "+a);
			}
			else
			{
				System.out.println("greater number is "+c);
			}
		}
		else
		{
			if(b>c)
			{
				System.out.println("greater number is "+b);
			}
			else
			{
				System.out.println("greater number is "+c);
			}
		}
		
		

	}

}
