public class Cuboid implements Shape
{
	// not is-a, got has-a (Cuboid has-a rectangle)
	private Rectangle lengthbreadth;
	private Rectangle lengthheight;
	private Rectangle breadthheight;

	public Cuboid(int length, int breadth, int height)
	{
		lengthbreadth = new Rectangle(length, breadth);
		lengthheight = new Rectangle(length, height);
		breadthheight = new Rectangle(breadth, height);
	}
	
	@Override
	public double area()
	{
		return 2*lengthbreadth.area() + 2*lengthheight.area() + 2*breadthheight.area();
	}
}
