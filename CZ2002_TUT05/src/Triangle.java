public class Triangle extends Polygon
{
	public Triangle(String theName, float theWidth, float theHeight)
	{
		super(theName, theWidth, theHeight);
		polytype = KindofPolygon.POLY_TRIANG;
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

