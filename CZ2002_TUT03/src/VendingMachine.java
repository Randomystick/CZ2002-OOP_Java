import java.util.Scanner;

public class VendingMachine
{
	Scanner sc = new Scanner(System.in);
	
	private double inserted;
	
	// constructor
	public VendingMachine()
	{
		inserted = 0;
	}
	
	// get the drink selection, and return the cost of the drink
	public double selectDrink()
	{
		System.out.println("====== Vending Machine ====== \n"
						 + "|1. Buy Beer ($3.00)        | \n"
						 + "|2. Buy Coke ($1.00)        | \n"
						 + "|3. Buy Green Tea ($5.00)   | \n"
						 + "============================= \n"
						 + "Please enter selection:");
		
		switch(sc.nextInt())
		{
			case 1:
				return 3.00;
			case 2:
				return 1.00;
			case 3:
				return 5.00;
		}
		return 0.00;
	}
	
	// insert the coins and returns the amount inserted
	public double insertCoins(double drinkCost)
	{
		inserted = inserted+drinkCost;
		return inserted;
	}
	
	// check the change and print the change on screen
	public void checkChange(double amount, double drinkCost)
	{
		System.out.printf("Change: $ ");
		System.out.println(amount-drinkCost);
	}
	
	// print the receipt and collect the drink
	public void printReceipt()
	{
		System.out.println("Please collect your drink\nThank You !!");
	}
}
