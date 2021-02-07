package loops;

import java.util.Scanner;

public class BreakInLoop {

	public static void main(String[] args) {
		
		for(int i = 1; i <=100; i++)
		{
			if(i==20)
			{
				break;
			}
			System.out.print(" "+i);
		}
		
		// Enter a negative number to stop loop execution :-----
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println();
		
		for( ; ;) 
		{
			
			int a = sc.nextInt();
			if(a < 0)
			{
				break;
			}
			
		}
		
		
		
		

	}

}
