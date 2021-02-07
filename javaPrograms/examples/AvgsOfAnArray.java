package javaPrograms.examples;
import java.util.*;
public class AvgsOfAnArray{
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		int[] arry = new int[n];
		int avgs = 0;
		
		for(int i = 0; i < n; i++) {
			arry[i] = input.nextInt();
		}
		
		
		for(int i = 0; i < arry.length; i++) {
			
			avgs += arry[i];
			
		}
		
		double avg = (double)avgs / n;
		
		System.out.println(avg);
		
		
		
	}
	
}