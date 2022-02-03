public class Cylinder implements Shape
{
	private Circle cr;
	private Rectangle rec;

	// not is-a, got has-a (Cylinder has-a circle and a rectangle of length pi*d)
    public Cylinder(int radius, int height)
    {
    	cr = new Circle(radius);
    	rec = new Rectangle(Math.PI*radius*2, height);
    }

    @Override
    public double area()
    {
    	return 2*cr.area() + rec.area();
    }
}
