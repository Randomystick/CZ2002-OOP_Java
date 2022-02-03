import java.util.Arrays;

public class Plane 
{
	// Declare variables without initialisation
	private PlaneSeat[] seat;
	private int numEmptySeat;
	
	// Constructor
	public Plane()
	{
		seat = new PlaneSeat[13];
		numEmptySeat = 12;
		for (int i = 1; i<numEmptySeat+1; i++)
		{
			seat[i] = new PlaneSeat(i);
		}
	}
	
	private PlaneSeat[] sortSeats(PlaneSeat[] seatCopy)
	{
		// sort the seats according to ascending order of customerID
		// copy of the original seat array is used for sorting instead of the original
		PlaneSeat[] seatSorted = new PlaneSeat[13];
		for (int i = 1; i<13; i++)
		{
			seatSorted[i] = new PlaneSeat(i);
		}
		
		int sortedIndex = 12;
		int lol = seatCopy.length;
		while (lol-- > 0)
		{
			/*
			System.out.printf("seatcopyyy ");
			for (int i=1; i<seatCopy.length; i++)
			{
				System.out.printf("%d ", seatCopy[i].getCustomerID());
			}	
			System.out.println();
			
			System.out.printf("seatsorted ");
			for (int i=1; i<seatSorted.length; i++)
			{
				System.out.printf("%d ", seatSorted[i].getCustomerID());
			}	
			System.out.println();
			*/
			
			int maxID = -1;
			int maxIndex = -1;
			for (int i=1; i<seatCopy.length; i++)
			{
				if (maxID < seatCopy[i].getCustomerID())
				{
					maxID = seatCopy[i].getCustomerID();
					maxIndex = i;
				}
			}
			if (maxIndex != -1)
			{
				seatCopy[maxIndex].assign(-1);
				seatSorted[sortedIndex].assign(maxIndex);
				sortedIndex--;
			}
		}
		//System.out.printf("seatsorted ");
		//for (int i=1; i<seatSorted.length; i++)
		//{
		//	System.out.printf("%d ", seatSorted[i].getCustomerID());
		//}	
		//System.out.println();
		return seatSorted;
	}
	
	// get methods
	public void showNumEmptySeats()
	{
		System.out.printf("There are %d empty seats\n", numEmptySeat);
	}
	
	public void showEmptySeats()
	{
		System.out.println("The following seats are empty:");
		for (int i = 1; i < seat.length; i++)
		{
			if (seat[i].isOccupied() == false)
			{
				System.out.println("SeatID " + seat[i].getSeatID());
			}
		}
	}
	
	public void showAssignedSeats(Boolean bySeatID)
	{			
		System.out.println("The seat assignments are as follow:");
		if (bySeatID)
		{
			for (int i = 1; i < seat.length; i++)
			{
				if (seat[i].getCustomerID() == -1)
				{
					continue;
				}
				System.out.printf("SeatID %d assigned to CustomerID %d\n", seat[i].getSeatID(), seat[i].getCustomerID());
			}
		}
		else
		{
			PlaneSeat[] seatSorted = new PlaneSeat[13];
			PlaneSeat[] seatCopy = new PlaneSeat[13];
			for (int i = 1; i<13; i++)
			{
				seatCopy[i] = new PlaneSeat(i);
			}
			for (int j=1; j<13; j++)
			{
				seatCopy[j].assign(seat[j].getCustomerID());
			}
			
			seatSorted = sortSeats(seatCopy);
			//System.out.printf("seat ");
			//for (int i1=1; i1<seat.length; i1++)
			//{
			//	System.out.printf("%d ", seat[i1].getCustomerID());
			//}	
			//System.out.println();
			
			for (int i = 1; i < seatSorted.length; i++)
			{
				int index = seatSorted[i].getCustomerID();
				//System.out.printf("Index %d \n", index);
				if (index == -1)
				{
					continue;
				}
				//if(seatSorted[index].getCustomerID() == -1)
				//{
				//	continue;
				//}
				System.out.printf("SeatID %d assigned to CustomerID %d\n", index, seat[index].getCustomerID());
			}
		}
	}
	
	//set methods	
	public void assignSeat(int SeatID, int CustomerID)
	{
		if (SeatID > 12 || SeatID < 1)
		{
			System.out.println("Enter a number between 1 and 12");
		}
		else if (seat[SeatID].isOccupied() == false)
		{
			seat[SeatID].assign(CustomerID);
			System.out.println("Seat Assigned!");
			numEmptySeat--;
		}
		else
		{
			System.out.println("Seat already assigned to a customer.");
		}
	}
	
	public void unAssignSeat(int SeatID)
	{
		seat[SeatID].unassign();
		System.out.println("Seat Unassigned!");
		numEmptySeat++;
	}
} // end class
