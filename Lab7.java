class Shape{
	 public void draw() {
		 System.out.println("I am Draw Method of Shape");
	 }
	 public void erase() {
		 System.out.println("I am Erase Method of Shape");
	 }
}

class Cricle extends Shape{

	public void draw() {
		
		 System.out.println("I am Draw Method of Circle");
	}

	public void erase() {
		 System.out.println("I am Erase Method of Circle");		
	}
	
}

class Triangle extends Shape{


	public void draw() {
		
		 System.out.println("I am Draw Method of Triangle");
	}

	
	public void erase() {
		
		System.out.println("I am Erase Method of Triangle");
	}
	
}

class Square extends Shape{


	public void draw() {
	
		 System.out.println("I am Draw Method of Square");
	}

	public void erase() {
		
		System.out.println("I am Erase Method of Square");
	}
	
}


public class Lab7 {

	public static void main(String[] args) {
		
		//Shape s = new Shape();
		//or
		Shape s;				//s is reference variable
		
		s = new Cricle();			
		s.draw();
		s.erase();
		
		s = new Triangle();
		s.draw();
		s.erase();
		
		s= new Square();
		s.draw();
		s.erase();
	}

}
