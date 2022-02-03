public class Rectangle implements Shape 
{
	private double length;
	private int breadth;
	
	public Rectangle(double length, int breadth)
	{
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	public double area() 
	{
		return length*breadth;
	}
}
