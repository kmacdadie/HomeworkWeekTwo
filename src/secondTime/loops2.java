package secondTime;

public class loops2 {

	public static void main(String[] args) {
	
	//A while loop that prints all even numbers from 0 to 100		
		int k = 0;
		while (k <= 100) {
			if (k % 2 == 0) {
				System.out.println(k);
			}
			k++;
		}	
	//A while loop that prints every 3rd number going backwards from 100 until we reach 0	
		int j = 100; 
		while (j >= 0) {
				System.out.println(j);
			j-=3;
		}
	//A for loop that prints every other number from 1 to 100
		for (int a = 1; a < 101; a++) {
			if (a % 2 == 1) {
				System.out.println(a);
			}
		}
	//A for loop that prints every number from 0 to 100, but if the number is divisible by 3, it prints �Hello� instead of the number, and if the number is divisible by 5, it prints �World� instead of the number, and if it is divisible by both 3 and 5, it prints �HelloWorld� instead of the number.	
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("Hello World");
			}
			else if (i % 3 == 0) {
				System.out.println("Hello");
			}
			else if (i % 5 == 0) {
				System.out.println("World");
			}
			else System.out.println(i);
		}
	}
}

