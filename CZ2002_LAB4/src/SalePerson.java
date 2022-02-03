public class SalePerson implements Comparable
{
	private String firstName;
	private String lastName;
	private int totalSales;
	
	public SalePerson(String firstName, String lastName, int totalSales)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.totalSales = totalSales;
	}

	public String toString()
	{
		return this.getLastName() + ", " + this.getFirstName() + ": " + this.getTotalSales();
	}
	
	public boolean equals(Object o)
	{
		if (o == null) return false;
		else if (!(o instanceof SalePerson)) return false;
		else
		{
			SalePerson oDowncasted = (SalePerson)o;
			return (oDowncasted.getFirstName() == this.getFirstName() && oDowncasted.getLastName() == this.getLastName());
		}
	}
	
	@Override
	public int compareTo(Object o) 
	{	
		if (o == null) return -1;
		else if (!(o instanceof SalePerson)) return -1;
		else
		{
			SalePerson oDowncasted = (SalePerson)o;

			if (this.totalSales < oDowncasted.totalSales)
			{
				return -1;
			}
			else if (this.totalSales > oDowncasted.totalSales)
			{
				return 1;
			}
			else
			{
				Comparable[] strList;
				strList = new Comparable[2];
				strList[0] = oDowncasted.lastName;
				strList[1] = this.lastName;
				Sorting.selectionSort(strList);
				if (strList[0] == this.lastName)
				{
					return 1;
				}
				else
				{
					return 0;
				}
			}
		}
	}
	
	public String getFirstName()
	{
		return firstName;
	}
	
	public String getLastName()
	{
		return lastName;
	}
	
	public int getTotalSales()
	{
		return totalSales;
	}
}
