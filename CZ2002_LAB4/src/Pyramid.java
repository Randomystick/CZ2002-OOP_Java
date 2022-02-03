import java.lang.Math;

public class Pyramid implements Shape
{
	private Triangle tri;
	private Square sq;
	
	// not is-a, got has-a (Pyramid has-a triangle and has-a rectangle)
    public Pyramid(int base, int height)
    {
    	double baseHalf = (double)base/2;
    	double triHeight = Math.sqrt(height*height+ baseHalf*baseHalf);
    	tri = new Triangle(base, triHeight);
    	sq = new Square(base);
    }

    @Override
    public double area()
    {
    	return 4*tri.area() + sq.area();
    }
}
