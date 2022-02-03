public class Circle extends Point
{
	protected double radius;
	
	public Circle()
	{
		super();
		radius = 0;
	}
	
	public Circle( int x, int y, double radius)
	{
		super(x, y);
		this.radius = radius;
	}
	
	public void setRadius(double radius)
	{
		this.radius = radius;
	}
	
	public double getRadius()
	{
		return radius;
	}
	
	public String toString()
	{
		return super.toString();
	}
	
	public double area()
	{
		return 3.1415926535897932384*radius*radius;
	}
}
