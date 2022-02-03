import java.util.Scanner;
//import java.util.concurrent.ThreadLocalRandom;

public class P4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("height : ");
		int h = sc.nextInt();
		
		if (h<=0)
		{
			System.out.println("error input");
		}
		
		else
		{
			char[] chars = new char[]{ 'A', 'B'};
			for (int i = 1; i <= h; i++)
			{
				int firstChar = (i % 2 == 0) ? 1 : 0; //if the row is even, start with B, else A.
				int numCharPairs = i;
				while (numCharPairs-->0)
				{
					System.out.printf("%s%s", chars[firstChar], chars[firstChar]);
					firstChar ^= 1; // 0 ^ 1 = 1 // 1 ^ 1 = 0
				}
				System.out.println();
			}
		}
	}
}