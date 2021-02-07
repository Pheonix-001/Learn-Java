package arrays;
import java.util.Scanner;
public class AddOfTwoMatrix {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int rows = sc.nextInt();
		int cols = sc.nextInt();
		
		int[][] ary1 = new int[rows][cols];
		int[][] ary2 = new int[rows][cols];
		int[][] ary3 = new int[rows][cols];
		
		
		for(int i = 0; i < rows; i++) 
		{
			for(int j = 0; j < cols; j++) 
			{
				ary1[i][j] = sc.nextInt();
			}
		}
		
		for(int i = 0; i < rows; i++)
		{
			for(int j = 0; j < cols; j++)
			{
				ary2[i][j] = sc.nextInt();
			
			}
		}
		
		for(int i = 0; i < rows; i++)
		{
			for(int j = 0; j < cols; j++)
			{
				ary3[i][j] = ary1[i][j] + ary2[i][j]; 
			}
		}
		
		for(int i = 0; i < rows; i++)
		{  System.out.print(" ");
			for(int j = 0; j < cols; j++)
			{  
				System.out.println(" ");
				System.out.println(ary3[i][j]);
			}
		}
		
		
		
	}

}
