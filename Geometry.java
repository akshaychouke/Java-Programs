// In this program I have calculated area of different shapes (particularly Square and Circle) 


import java.util.*;

class Square {			// Creating Square class

	int sqArea;		// Defining variable

	void setArea(int side) {	// function to calculate the area of Square 
		sqArea = side * side;
	}

	void getArea() {		
		System.out.println("The Area of Square is : " + sqArea);
	}

}

class Circle {			// Creating Circle class

	double CrArea;

	void setArea(double radius) {			// function to calculate the area of Circle 
		CrArea = 3.141 * radius * radius;
	}

	void getArea() {
		System.out.println("The Area of Circle is : " + CrArea);
	}

}

public class Geometry {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the side of the Square : ");

		int side = sc.nextInt();

		Square sq = new Square(); 		//creating object of Square class
		sq.setArea(side);
		sq.getArea();

		System.out.println("Enter the raduis of the Circle : ");

		int raduis = sc.nextInt();

		Circle cr = new Circle();		//creating object of Circle class
		cr.setArea(raduis);
		cr.getArea();

	}

}
