package loops;

public class ContinueInLoop {

	public static void main(String[] args) {
		
		// Print ony odd number in 0 - 100
		
		for(int a =0;a <=100;a++)
		{
			
			if(a % 2 == 0)
			{
				continue;
			}
			System.out.print(" "+a);
			
		}

	}

}
