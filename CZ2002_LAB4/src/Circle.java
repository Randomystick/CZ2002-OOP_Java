public class Circle implements Shape 
{
	private int radius;
	
	public Circle(int radius2)
	{
		this.radius = radius2;
	}

	@Override
	public double area() 
	{
		return Math.PI*radius*radius;
	}
}
