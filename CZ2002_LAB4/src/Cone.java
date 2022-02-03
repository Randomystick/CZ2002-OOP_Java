public class Cone implements Shape
{
	private Circle cr;
	private double l;
	private int radius;

	// not is-a, got has-a (Cone has-a circle)
    public Cone(int radius, int height)
    {
    	cr = new Circle(radius);
    	this.radius = radius;
    	l = Math.sqrt(height*height+ radius*radius);
    }

    @Override
    public double area()
    {
    	return cr.area() + Math.PI*radius*l;
    }
}
