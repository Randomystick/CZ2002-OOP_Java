public class Circle 
{
	private double radius;
	private static final double PI = 3.1415926535897932384;
	
	//constructors
	public Circle(double rad)
	{
		radius = rad;
		System.out.println("A new circle is created");
	}

	//mutator method - set radius
	public void setRadius(double rad)
	{
		radius = rad;
	}
	
	//accessor method - get radius
	public double getRadius()
	{
		return radius;
	}
	
	//calculate area
	public double area()
	{
		return PI*radius*radius;
	}
	
	//calculate circumference
	public double circumference()
	{
		return PI*radius*2;
	}
	
	//print area
	public void printArea()
	{
		System.out.println("Area of circle\nRadius: " + this.getRadius() + "\nArea: " + this.area() + "\n");
	}
	
	//print circumference
	public void printCircumference()
	{
		System.out.println("Circumference of circle\nRadius: " + this.getRadius() + "\nCircumference: " + this.circumference() + "\n");
	}
}
 