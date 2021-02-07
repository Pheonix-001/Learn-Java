package arrays;
import java.util.Scanner;

public class DeclarationAndInitialision {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] name = {23, 34, 43, 34, 32};
		
		for(int i = 0; i < name.length; i++)
		{
			System.out.println(name[i]);	
		}
		
		// for-each loop
		
		int[] a = {5, 4, 3,};
		
		for(int i : a)
		{
			System.out.println(i);
		}
		
		
	}
	
}