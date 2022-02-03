public class Sphere implements Shape
{
	// not is-a, no has-a
	
	private int radius;
	
	public Sphere(int radius)
	{
		this.radius = radius;
	}
	
	@Override
	public double area() 
	{
		return 4*Math.PI*radius*radius;	
	}
}
