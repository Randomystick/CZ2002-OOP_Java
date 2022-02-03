import java.util.Scanner;
import java.util.ArrayList;

public class Shape2DApp {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int noOfShapes = 0;
        int shapeChoice = 0;

        System.out.print("Enter the total number of shapes: ");
        noOfShapes = sc.nextInt();

        Shape[] shapes = new Shape[noOfShapes];

        for (int i=0; i < noOfShapes; i++)
        {
            System.out.printf("1. Square\n2. Rectangle\n3. Circle\n4. Triangle\n\nSelect shape %d: ", (i+1));
            shapeChoice = sc.nextInt();

            switch (shapeChoice)
            {
	            case 1:
	                System.out.print("Key in square's length: ");
	                int length = sc.nextInt();
	                shapes[i] = new Square(length);
	                break;
                case 2:
                    System.out.print("Key in rectangle's length: ");
                    length = sc.nextInt();
                    System.out.print("Key in rectangle's breadth: ");
                    int breadth = sc.nextInt();
                    shapes[i] = new Rectangle(length, breadth);
                    break;
                case 3:
                    System.out.print("Key in circle's radius: ");
                    int radius = sc.nextInt();
                    shapes[i] = new Circle(radius);
                    break;
                case 4:
                    System.out.print("Key in triangle's base: ");
                    int base = sc.nextInt();
                    System.out.print("Key in triangle's height: ");
                    int height = sc.nextInt();
                    shapes[i] = new Triangle(base, height);
                    break;
                default:
                	System.out.print("Invalid choice, try again");
                	i--;
                	break;
            }
        }

        // choose the type of calculation (for now, we will just calculate Area, with future plan to calculate Volume as well).
        System.out.println("Choose the type of calcuation: \n" +
        				   "1. Area						   \n" +
        				   "2. Exit						     ");
        int choice = sc.nextInt();
        do
        {
            if (choice == 1)
            {
    	        double totalArea = 0;
    	
    	        for (int i=0; i < noOfShapes; i++)
    	        {
    	            totalArea += shapes[i].area();
    	        }
    	        System.out.printf("Total Area: %.2f", totalArea);
            }
            else if (choice == 2)
            {
            	System.out.printf("program end");
            }
        } while (choice != 1 && choice != 2);
    }
}