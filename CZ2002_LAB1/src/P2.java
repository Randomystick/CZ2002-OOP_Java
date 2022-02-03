import java.util.Scanner;

public class P2
{
	public static void main(String[] args)
	{
		int mer = -1;
		do
		{
			String grade = "NA";
			Scanner sc = new Scanner(System.in);
			System.out.println("salary : $");
			int sal = sc.nextInt();
			System.out.println("merit :");
			mer = sc.nextInt();
			
			if (500<=sal && sal<=599)
			{
				grade = "C";
			}
			else if (600<=sal && sal<=649 && mer<10)
			{
				grade = "C";
			}
			else if (600<=sal & sal<=699)
			{
				grade = "B";
			}
			else if (700<=sal && sal<=799 && mer<20)
			{
				grade = "B";
			}
			else
			{
				grade = "A";
			}
			
			System.out.println("Grade - " + grade);
		} while (mer != -1);
	}
}
