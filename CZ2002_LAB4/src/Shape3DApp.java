import java.util.Scanner;
import java.util.ArrayList;

public class Shape3DApp {
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
            System.out.printf("1. Pyramid\n2. Cuboid\n3. Sphere\n4. Cone\n5. Cylinder\nSelect shape %d: ", (i+1));
            shapeChoice = sc.nextInt();

            switch (shapeChoice)
            {
	            case 1:
	                System.out.print("Key in pyramid's base: ");
	                int base = sc.nextInt();
	                System.out.print("Key in pyramid's height: ");
	                int height = sc.nextInt();
	                shapes[i] = new Pyramid(base, height);
	                break;
                case 2:
                    System.out.print("Key in cuboid's length: ");
                    int length = sc.nextInt();
                    System.out.print("Key in cuboid's breadth: ");
                    int breadth = sc.nextInt();
                    System.out.print("Key in cuboid's height: ");
                    int height1 = sc.nextInt();
                    shapes[i] = new Cuboid(length, breadth, height1);
                    break;
                case 3:
                    System.out.print("Key in sphere's radius: ");
                    int radius = sc.nextInt();
                    shapes[i] = new Sphere(radius);
                    break;
                    
                case 4:
                    System.out.print("Key in cone's radius: ");
                    int radius1 = sc.nextInt();
                    System.out.print("Key in cone's height: ");
                    int height11 = sc.nextInt();
                    shapes[i] = new Cone(radius1, height11);
                    break;
                case 5:
                    System.out.print("Key in cylinder's radius: ");
                    int radius11 = sc.nextInt();
                    System.out.print("Key in cylinder's height: ");
                    int height111 = sc.nextInt();
                    shapes[i] = new Cylinder(radius11, height111);
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