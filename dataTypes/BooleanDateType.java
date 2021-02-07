package dataTypes;
import java.util.Scanner;
public class BooleanDateType {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean num; 
		
		System.out.println("Enter any even number:-");
		
		int a = sc.nextInt();
		
		if(a%2==0)
		{
			num = true;
		}
		else 
		{
			num = false;
		}
		
		System.out.println("given number is "+num);

	}

}
