import java.util.*;

class Square {

	int sqArea;

	void setArea(int side) {
		sqArea = side * side;
	}

	void getArea() {
		System.out.println("The Area of Square is : " + sqArea);
	}

}

class Circle {

	double CrArea;

	void setArea(double radius) {
		CrArea = 3.141 * radius * radius;
	}

	void getArea() {
		System.out.println("The Area of Circle is : " + CrArea);
	}

}

public class Geometry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the side of the Square : ");

		int side = sc.nextInt();

		Square sq = new Square();
		sq.setArea(side);
		sq.getArea();

		System.out.println("Enter the raduis of the Circle : ");

		int raduis = sc.nextInt();

		Circle cr = new Circle();
		cr.setArea(raduis);
		cr.getArea();

	}

}
