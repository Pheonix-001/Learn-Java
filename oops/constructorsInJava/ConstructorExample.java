package oops.constructorsInJava;
//import java.util.Scanner;
class Phone
{
	int display, ram, rom;
	String processor, name;
	
	Phone(int displaySize , int ramSize, int storage, String processorName, String phoneName)
	{
		display = displaySize;
		ram = ramSize;
		rom = storage;
		processor = processorName;
		name = phoneName;
	}
	
	void mi()
	{
		System.out.println(name+" :- "+display+" inch display size and " +ram+"gb ram and "+rom+"gb storage and "+processor+" SOC");
	}
	
	
}


public class ConstructorExample {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
		
		Phone redmi = new Phone(5,6,64,"sg","redmi k20");
		
		
		redmi.mi();
		
	}

}
