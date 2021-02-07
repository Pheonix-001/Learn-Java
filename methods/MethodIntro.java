package methods;      					
import java.util.Scanner;				//maxOfTwoNumbers,By passing Parameters
public class MethodIntro {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any two number to check which one is maximum :");
		
		int firstNum = sc.nextInt();
		int secndNum = sc.nextInt();
		
		int result = maxOfTwo(firstNum, secndNum);
		
		System.out.println(result);
		
//		int a = maxOfTwo(5, 6);
//		System.out.println("a is "+a);
		
//		int b = maxOfTwo(4748, 5838);
//		System.out.println(b);

	}
	
	static int maxOfTwo( int a , int b)
	{
//		return a > b ? a : b;
		
		if(a > b)
		{
			return a;
		}
		else
		{
			return b;
		}
		
	}

}
