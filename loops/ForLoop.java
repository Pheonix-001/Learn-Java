package loops;
import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ente any number");
		
		for(int a = sc.nextInt(); a < 10 ; a++)
		{
			System.out.println("Output is " + a);
		}

	}

}
