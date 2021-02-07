package javaPrograms;
import java.util.Scanner;
public class AvgUsingArray {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter no of student:- ");
		
		int n = sc.nextInt();
		float avg = 0;
		
		int marks[] = new int[n];
		
		for(int i = 0; i < n; i++) {
			
			marks[i] = sc.nextInt();	
		}
		
		
		for(int i = 0; i < n; i++) {
			
			avg = avg + marks[i];
		}
		
		avg = avg / n;
		
		System.out.println(avg);
	}

}
