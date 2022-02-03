public class Rectangle extends Polygon
{
	public Rectangle(String theName, float theWidth, float theHeight)
	{
		super(theName, theWidth, theHeight);
		polytype = KindofPolygon.POLY_RECT;
	}	
	
	
	public void printArea(Rectangle r)
	{
		System.out.println("Area is " + width*height);
	}
	
	public void printArea(Triangle t)
	{
		System.out.println("Area is " + 0.5*width*height);
	}
}
