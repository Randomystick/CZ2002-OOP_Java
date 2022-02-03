import java.util.Scanner;

public class VendingMachineApp {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		VendingMachine hii = new VendingMachine();
		
		double drinkCost = hii.selectDrink();
		double curInsert = 0;
		System.out.println("Please insert coins: \n"
				         + "========== Coins Input =========== \n"
				         + "|Enter 'Q' for ten cents input   | \n" 
				         + "|Enter 'T' for twenty cents input| \n"
				         + "|Enter 'F' for fifty cents input | \n"
				         + "|Enter 'N' for a dollar input    | \n"
				         + "==================================");
		while (drinkCost > curInsert)
		{
			char lol = sc.next().charAt(0);
			switch(lol)
			{
				case 'Q':
					curInsert = hii.insertCoins(0.10);
					break;
				case 'T':
					curInsert = hii.insertCoins(0.20);
					break;
				case 'F':
					curInsert = hii.insertCoins(0.50);
					break;
				case 'N':
					curInsert = hii.insertCoins(1.00);
					break;
			}
			System.out.printf("Coins inserted: " + curInsert);
		}
		hii.checkChange(curInsert, drinkCost);
		hii.printReceipt();
	}
}
/*
 * selectDrink should take in parameter value so that selection can be a private attribute of vending machine
 */
