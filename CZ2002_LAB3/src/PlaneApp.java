import java.util.Scanner;

public class PlaneApp 
{
	public static void main(String args[])
	{
		Plane planee = new Plane();
		
		System.out.println
		(
				"(1) Show number of empty seats\n" +
				"(2) Show the list of empty seats\n" +
				"(3) Show the list of seat assignments by seat ID\n" +
				"(4) Show the list of seat assignments by customer ID\n" +
				"(5) Assign a customer to a seat\n" +
				"(6) Remove a seat assignment\n" +
				"(7) Exit\n"
		);
		
		Scanner sc = new Scanner(System.in);
		int choice = -1;
		do
		{
			System.out.printf("Enter the number of your choice: ");
			choice = sc.nextInt();
			
			switch(choice)
			{
				// show number of empty seats
				case 1:
					planee.showNumEmptySeats();
					break;
					
				// show list of empty seats
				case 2:
					planee.showEmptySeats();
					break;
				
				// show list of seat assignments by seat ID
				case 3:
					planee.showAssignedSeats(true);
					break;
				
				// show list of seat assignments by customer ID
				case 4:
					planee.showAssignedSeats(false);
					break;
				
				// assign customer a seat
				case 5:
					System.out.println("Assigning Seat ..");
					System.out.printf("Please enter SeatID: ");
					int SeatID = sc.nextInt();
					System.out.printf("Please enter Customer ID: ");
					int CustID = sc.nextInt();
					planee.assignSeat(SeatID, CustID);
					break;
				
				// remove a seat assignment
				case 6:
					System.out.printf("Enter SeatID to unassign customer from: ");
					SeatID = sc.nextInt();
					planee.unAssignSeat(SeatID);
					break;
				
				// exit
				case 7:
					System.out.println("Quitting");
					break;
					
				default:
					System.out.println("Invalid choice");
					break;		
			}
		} while (choice != 7);
	}
}
