import java.util.*;

class Pump {
	float price;
	double amount, quantity;

	void setPirce(float p) {
		price = p;
	}

	void getPrice() {
		System.out.println("The price of Petrol is : " + price);
	}

	Pump() {
		amount = 0.0;
		quantity = 0.0;

		System.out.println("The Amount is : " + amount);
		System.out.println("The Quantity is : " + quantity);
	}

	void enterAmount() {
		System.out.println("Enter amount >10 : \n");
		Scanner sc = new Scanner(System.in);
		amount = sc.nextDouble();
		quantity = amount / price;
		System.out.println("Quantity is : " + (float) quantity + " Litre");
		System.out.println("Your Bill is  : " + amount + " rupee");
	}

	void enterQuantity() {
		System.out.println("Enter Quantity in Litres: ");
		Scanner sc = new Scanner(System.in);
		quantity = sc.nextDouble();
		amount = quantity * price;
		System.out.println("Quantity is : " + quantity + " Litre");
		System.out.println("Your Bill is : " + amount + " rupee");
	}
}

public class PetrolPump1 {

	public static void main(String[] args) {
		String choice;

		Pump p1 = new Pump();
		p1.setPirce(90);
		p1.getPrice();

		System.out.println("Enter q for  Quantity or a for Amount ");
		Scanner sc = new Scanner(System.in);
		choice = sc.nextLine();

		switch (choice) {
		case "q":
			p1.enterQuantity();
			break;
		case "a":
			p1.enterAmount();
			break;
		default:
			System.out.println("Invalid Choice");
		}
	}

}
