import java.util.Scanner;

public class CircleApp {
	public static void main(String[] args)
	{
		System.out.println
		(
				"==== Circle Computation =====\n" +
				"|1. Create a new circle     |\n" +
			    "|2. Print Area              |\n" +
				"|3. Print circumference     |\n" +
			    "|4. Quit                    |\n" +
				"=============================\n"
		);
		
		Scanner sc = new Scanner(System.in);
		int choice = -1;
		Circle userCircle = null;
		do
		{
			System.out.println("Choose option (1-3)");
			choice = sc.nextInt();
			switch(choice)
			{
				case 1:
					System.out.println("Enter the radius to compute the area and circumference");
					double rad = sc.nextDouble();
					userCircle = new Circle(rad);
					userCircle.setRadius(rad);
					break;
					
				case 2:
					if (userCircle != null)
						userCircle.printArea();
					else
						System.out.println("Circle is null");
					break;
					
				case 3:
					if (userCircle != null)
						userCircle.printCircumference();
					else
						System.out.println("Circle is null");
					break;
					
				case 4:
					System.out.println("bye");
					break;
				
				default:
					System.out.println("Invalid choice");
					break;
			}
		} while  (choice !=4);
	}
}
