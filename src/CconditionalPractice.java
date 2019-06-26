
public class CconditionalPractice {

	public static void main(String[] args) {
		
		
		double costOfTruck = 30.50;
		double moneyInWallet = 75.50;
		int numberOfTrucks = 3;
		
		if (costOfTruck < 15.50) {
			System.out.println("I shoud buy two!");
		} else if (costOfTruck > 45) {
			System.out.println( "I can only buy one.");
		} else if (costOfTruck >= 30.50 && moneyInWallet < 100) {
			System.out.println("I can Buy a truck");
		}
		
		String name = "Keith";
		
		if (name == "Keith") {
			System.out.println("Megan is Keith's wife.");
		}
		
		int age = 15;
		
		if (age >= 16) {
			System.out.println("You can get a Drivers license.");
		} else {
			System.out.println("You can not get a Drivers license. You must wait " + (16 - age) + " " + "More year/years." );
		}
		
		double priceOfMilk = 2.99;
		
		if (priceOfMilk < 3) {
			System.out.println("Buy of milk.");
		} else if (priceOfMilk < 3) {
			System.out.println("Buy 1 gallon of milk.");
		} else {
			System.out.println("Dont buy milk, its to expesive.");
		}
	
		char grade = 'a';
		
		switch (grade) {
			case 'a':
				System.out.println("90 - 100");
				break;
			case 'b':
				System.out.println("80 - 89");
		}
		
	
	}
}
