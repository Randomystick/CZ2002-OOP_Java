public class main {

	public static void main(String[] args) 
	{
		Rectangle rec = new Rectangle("r1", 1, 1);
		Triangle tri = new Triangle("t1", 1, 1);
		
		rec.printArea(rec);
		rec.printArea(tri);
		
		tri.printArea(rec);
		tri.printArea(tri);
		// if a new subcass is introduced, need to add that subclass' overloaded printArea method to all subclasses.
		
		
	}

}
