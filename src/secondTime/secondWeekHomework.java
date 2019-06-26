package secondTime;

public class secondWeekHomework {
	
	public static void main(String[] args) {
		
		//System.out.println(true && false);  = false
		//System.out.println(true || false);  = true
		//System.out.println(false && false);  = false
		//System.out.println(true && (false || true)); = true 
		//System.out.println(false || (true && false)); = false
		//System.out.println(false || 1 < 5); = true
		//System.out.println(5 >= 4 && 1 > 3); = false
		//System.out.println(10 < 4 || 1 > 4); = false
		//System.out.println(12 >= 2 && 1 < 24); = true 
		//System.out.println(Hello.charAt(0) == ‘h’); = false
		
		boolean isHotOutside = true;
		boolean isWeekday = true;
		boolean hasMoneyInPocket = false;
		
		double costOfMilk = 2.99;
		double moneyInWallet = 7;
		int thirstLevel = 8;
		
		boolean shouldByIcecream = isHotOutside && hasMoneyInPocket;
		boolean willGoSwimming = isHotOutside && !isWeekday;
		boolean isAGoodDay = isHotOutside && hasMoneyInPocket && !isWeekday;
		boolean willBuyMilk = isHotOutside && thirstLevel >= 3 && moneyInWallet >= 2*costOfMilk;	
	}
}
