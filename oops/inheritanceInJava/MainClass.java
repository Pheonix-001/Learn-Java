package oops.inheritanceInJava;

public class MainClass {

	public static void main(String[] args) {

		TeacherClass t = new TeacherClass();
		
		t.name = "Akash";
		
		t.eat();
		
		t.walk();
		
		t.teach();
		
		System.out.println();
		
		SingerClass s = new SingerClass();
		
		s.name = "Arjeet";
		
		s.eat();
		
		s.walk();
		
		s.sing();
		
		System.out.println();
		
		PainterClass p = new PainterClass();
		
		p.name = "Aman";
		
		p.eat();
		
		p.walk();
		
		p.paint();
		
		
		// Downing Casting
		
		TeacherClass t2 = new TeacherClass();
		
		PersonClass p1 = t2;
		
		TeacherClass t1 = (TeacherClass)p1;
		
		System.out.println("\n");
		s.sing();
		
	}

}
