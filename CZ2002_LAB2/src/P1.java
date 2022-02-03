import java.util.Scanner;
import java.lang.Math;

public class P1 
{
	public static void main(String[] args)
	{
		int choice;
		Scanner sc = new Scanner(System.in);
		do 
		{
			System.out.println("Perform the following methods:");
			System.out.println("1: miltiplication test");
			System.out.println("2: quotient using division by subtraction");
			System.out.println("3: remainder using division by subtraction");
			System.out.println("4: count the number of digits");
			System.out.println("5: position of a digit");
			System.out.println("6: extract all odd digits");
			System.out.println("7: quit");
			choice = sc.nextInt();
			switch (choice) 
			{
			case 1:
				mulTest();
				break;
			case 2:
				System.out.printf("m = ");
				int m2 = sc.nextInt();
				System.out.printf("n = ");
				int n2 = sc.nextInt();
				System.out.println(m2 + "/" + n2 + " = " + divide(m2, n2));
				break;
			case 3:
				System.out.printf("m = ");
				int m3 = sc.nextInt();
				System.out.printf("n = ");
				int n3 = sc.nextInt();
				System.out.println(m3 + " % " + n3 + " = " + modulus(m3, n3));
				break;
			case 4:
				System.out.printf("n : ");
				int m4 = sc.nextInt();
				System.out.printf("n : " + m4 + " - ");
				int ans4 = countDigits(m4);
				if (ans4==-1)
				{
					System.out.println("Error input!!");
				}
				else
				{
					System.out.println("count = " + ans4);
				}
				break;
			case 5:
				System.out.printf("n : ");
				int m5 = sc.nextInt();
				System.out.printf("digit : ");
				int digit5 = sc.nextInt();
				System.out.println("position = " + position(m5,digit5));
				break;
			case 6:
				System.out.printf("n : ");
				Long m6 = sc.nextLong();
				System.out.printf("oddDigits = ");
				long ans6 = extractOddDigits(m6);
				if (ans6==-99)
				{
					System.out.println("Error input!");
				}
				else
				{
					System.out.println(ans6);
				}
				break;
			case 7: 
				System.out.println("Program terminating ….");
			}
		} while (choice < 7);
	}

//////////////////////////////
////////////  01  ////////////
//////////////////////////////
	public static void mulTest()
	{
		final int NUM_QNS = 5;
		Scanner sc = new Scanner(System.in);
		int correct = NUM_QNS;
		
		for (int i=0; i<NUM_QNS; i++)
		{
			int num1 = (int)(Math.random()*9)+1;
			int num2 = (int)(Math.random()*9)+1;
			int ans = num1*num2;
			System.out.println("How much is " + num1 + " times " + num2 + "?");
			if (sc.nextInt() != ans)
			{
				System.out.println("incorrect");
				correct--;
			}
			else
			{
				System.out.println("correct");
			}
		}
		System.out.println(correct + " answers out of " + NUM_QNS + " are correct.");
	}

//////////////////////////////
////////////  02  ////////////
//////////////////////////////
	public static int divide(int m, int n)
	{
		int quotient = 0;
		// return m/n
		while (m>0)
		{
			m -= n;
			quotient++;
		}
		if (m<0) quotient--;
		
		return quotient;
	}

//////////////////////////////
////////////  03  ////////////
//////////////////////////////
	public static int modulus(int m, int n)
	{
		// return m%n
		while (m>=n)
		{
			m -= n;
		}
		return m;
	}
	
//////////////////////////////
////////////  04  ////////////
//////////////////////////////
	public static int countDigits(int n)
	{
		int numDigits = 0;
		if (n<0)
		{
			return -1;
		}
		while (n>0)
		{
			n = n/10;
			numDigits++;
		}
		return numDigits;
	}

//////////////////////////////
////////////  05  ////////////
//////////////////////////////
	public static int position(int n, int digit)
	{
		int pos = -1;
		int curPos = 1;
		while (n>0)
		{
			if (digit == n%10)
			{
				pos = curPos;
				break;
			}
			else
			{
				n = n/10;
				curPos++;
			}
		}
		
		return pos;
	}

//////////////////////////////
////////////  06  ////////////
//////////////////////////////
	public static long extractOddDigits(long n)
	{
		if (n<=0)
		{
			return -99;
		}
		long returnVal = 0;
		int digitPos = 0; //count from the right, i.e. 3210
		while (n>0)
		{
			if (n%10 % 2 != 0)
			{
				returnVal += (n%10) * Math.pow(10, digitPos);
				digitPos++;
			}
			n = n/10;
		}
		
		if (returnVal==0)
		{
			return -1;
		}
		else
		{
			return returnVal;
		}
	}
		
	
	
	
} // END PROGRAM