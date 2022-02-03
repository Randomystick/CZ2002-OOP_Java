import java.util.Scanner;

public class P1 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		boolean invalid = false;
		
		System.out.println("Enter your choice: ");
		char choice;
		do
		{
			choice = sc.next().charAt(0);
			switch(choice)
			{
				case ('A'):
				case ('a'):
					System.out.println("Action movie fan\n");
					break;
				case ('C'):
				case ('c'):
					System.out.println("Comedy movie fan\n");
					break;
				case ('D'):
				case ('d'):
					System.out.println("Drama movie fan\n");
					break;
				default:
					System.out.println("Invalid choice\n");
					invalid = true;
					break;		
			}
		} while (!invalid);
	}
}
