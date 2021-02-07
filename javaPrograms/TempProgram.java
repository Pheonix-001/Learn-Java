package javaPrograms;


class Store
{
	
	int ammount;
	int unit;
	String name;
	
	Store(int price, int num, String name2)
	{
		
		ammount = price;
		unit = num;
		name = name2;
		
	}
	
	void product() {
		System.out.println(ammount + " "+ unit +" " + name);
	}
}

public class TempProgram{
	

	
	public static void main(String[] args) {

		
		Store obj1 = new Store(500,5,"Soap");
		
		obj1.product();
		
		
		
		
		
		
		
	}
}