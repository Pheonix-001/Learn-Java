package oops.encapsulationInJava;

public class Student {

	private int age;
	private String name;
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		
		if(age>30) {
			System.out.println("your age is greater than 30");
		}
		else {
		this.age = age;
		}
	}
	
	
}
