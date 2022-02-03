public class Triangle implements Shape 
{
	private int base;
	private double height;
	
	public Triangle(int base, double height)
	{
		this.base = base;
		this.height = height;
	}

	@Override
	public double area() 
	{
		return 0.5*base*height;
	}
}
