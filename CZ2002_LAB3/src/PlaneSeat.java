public class PlaneSeat 
{
	// Declare variables without initialisation
	private int 	seatID;
	private Boolean	assigned;
	private int		customerID;
	
	// Constructors
	public PlaneSeat()
	{
		seatID = -1;
		assigned = false;
		customerID = -1;
	}
	public PlaneSeat(int seatID)
	{
		this.seatID = seatID;
		assigned = false;
		customerID = -1;
	}
	
	//get methods
	public int getSeatID()
	{
		return seatID;
	}
	public int getCustomerID()
	{
		return customerID;
	}
	public Boolean isOccupied()
	{
		return assigned;
	}
	
	//set methods
	public void assign(int customerID)
	{
		this.customerID = customerID;
		this.assigned = true;
	}
	public void unassign()
	{
		customerID = -1;
		assigned = false;
	}
}
