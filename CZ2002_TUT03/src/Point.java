public class Point
{
	protected int x, y;
	
	public Point() {};
	
	public Point(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	
	public String toString()
	{
		return "[ " + getX() + ", " + getY() + " ]";
	}
	
	public int getX()
	{
		return x;
	}
	
	public int getY()
	{
		return y;
	}
}
