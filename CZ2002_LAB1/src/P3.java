import java.util.Scanner;
//import java.util.concurrent.ThreadLocalRandom;

public class P3 {
	public static void main(String[] args) {
		final double CONVERSION = 1.82;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("starting : ");
		int start = sc.nextInt();
		
		System.out.println("ending : ");
		int end = sc.nextInt();
		
		System.out.println("increment : ");
		int increment = sc.nextInt();
		
		System.out.println("generationType :");
		int genType = sc.nextInt();
		
		if (end < start || increment <=0)
		{
			System.out.println("Error input");
		}
		else
		{
			System.out.println
			(
					"US$            S$\n" +
					"-----------------"
			);
			//int choice = ThreadLocalRandom.current().nextInt(1, 3 + 1);
			switch(genType)
			{
				case 1:
				{
					for (int i = start; i < end+1; i += increment)
					{
						System.out.println(i + "          " + i*CONVERSION);
					}
					break;
				}
				case 2:
				{
					int i = start;
					while (i != end+1)
					{
						System.out.println(i + "          " + i*CONVERSION);
						i += increment;
					}
					break;
				}
				case 3:
				{
					int i = start;
					do
					{
						System.out.println(i + "          " + i*CONVERSION);
						i += increment;
					} while (i != end+1);
					break;
				}
			}
		}
	}

}
