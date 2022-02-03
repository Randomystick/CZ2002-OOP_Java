public abstract class Polygon 
{
	public enum KindofPolygon { POLY_PLAIN, POLY_RECT, POLY_TRIANG};
	protected String name;
	protected float width;
	protected float height;
	protected KindofPolygon polytype;
	
	public Polygon(String theName, float theWidth, float theHeight)
	{
		name = theName;
		width = theWidth;
		height = theHeight;
		polytype = KindofPolygon.POLY_PLAIN;
	}
	
	public KindofPolygon getPolytype() { return polytype; }
	
	public void setPolytype(KindofPolygon value) { polytype = value; }

	public String getName() { return name; }

	public /*abstract*/ void calArea() {} //change to abstract so that the subclasses must implement calArea().
	// this is appropriate because different subclasses may have different ways to calculate their area.

	public void printWidthHeight( ) 
	{
		System.out.println("Width = " + width + " Height = " + height);
	}
	
	public void printAreaDYBI(Polygon poly)
	{
		KindofPolygon lol = poly.getPolytype();
		if (lol == KindofPolygon.POLY_RECT)
		{
			System.out.println("Area is " + width*height);
		}
		else if (lol == KindofPolygon.POLY_TRIANG)
		{
			System.out.println("Area is " + 0.5*width*height);
		}
	}
}