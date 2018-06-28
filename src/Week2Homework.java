import java.util.Scanner;

public class Week2Homework {

	public static void main(String[] args) {
		

		int decision = 0;
		String userName = "unknown";
		String favoriteTruckBrand = "Ford, Chevy, Dodge";
		String TruckSize = "1500, 2500, 3500";
		String Color = "Red, Black, White";
		Scanner sc = new Scanner(System.in);
				
		while (decision != -1){
			System.out.println("Welcome, " + userName);
			System.out.println("1) Rename User");
			System.out.println("2) Pick a your favorite truck brand");
			System.out.println("3) Pick size of truck");
			System.out.println("4) Pick color");
			System.out.println("5) Exit");
		 decision = sc.nextInt();
		 
		 switch(decision) {}
			
		 if (decision > 6 || decision < -1) {
			System.out.println("PLEASE FOLLOW THE INSTRUCTIONS!");
			
		} else if (decision == 1) {
			System.out.print("Enter User Name: ");
			userName = sc.next();}
	
		 else if (decision == 2) {
			System.out.print("Pick your favorite truck brand Ford, Chevy, Dodge");
			favoriteTruckBrand = sc.next();}
			System.out.println("Favorite Brand" + " " + favoriteTruckBrand);
			
		 if (decision == 3) {
			System.out.print("Pick size of truck 1500, 2500, 3500");
			TruckSize = sc.next();}
			System.out.println("Truck Size" + " " + TruckSize);	
			
		 if (decision == 4) {
			System.out.print("Pick Color Red, Black, White");
			Color = sc.next();}
			System.out.println("Truck Color" + " " + Color);	
	
	
	}
		
	}	
	}


