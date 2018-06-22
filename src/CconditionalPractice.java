
public class CconditionalPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
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
		
		
		
		
	}

}
