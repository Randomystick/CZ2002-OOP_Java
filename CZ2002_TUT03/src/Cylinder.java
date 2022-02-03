public class Cylinder extends Circle
{
	private double height;
	
	public void setHeight(double height)
	{
		this.height = height;
	}
	
	//where constructors??
	/*
	 * public Cylinder() { height = 1; }
	 * public Cylinder(double h) { height = h; }
	 * public Cylinder(double h, double r)
	 * {
	 * 	super().
	 * }
	 */
	
	public double getHeight()
	{
		return height;
	}
	
	public String toString()
	{
		return super.toString();
	}
	
	public double volume()
	{
		return super.area()*height;
	}
	
	public double area()
	{
		return 3.1415926535897932384*2*radius*height;
	}
}

/*
 * no, the point class has many class-specific methods that the circle and cylinder class don't need.
 * alternative: define an abstract class
 */
