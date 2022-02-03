
//#include<stdio.h>
import java.util.Scanner;

public class TUT01_bubbleSort
{	
	static void bubble(int a[],int n)
	{
		int i,j,t;
		for(i=n-2;i>=0;i--)
		{
			for(j=0;j<=i;j++)
			{
				if(a[j]>a[j+1])
				{
					t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;
				}
			}
		}
	} //end bubble function
	
	//int main()
	public static void main(String args[])
	{
		//int a[100],n,i;
		int n,i;
		int[] a = new int [100];
		
		//printf("\n\n Enter number of Integer elements to be sorted: ");
		System.out.println("\n\n Enter number of Integer elements to be sorted: ");
		
		//scanf("%d",&n);
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		
		for( i=0;i<=n-1;i++)
		{
			//printf("\n\n Enter integer value for element no.%d : ",i+1);
			System.out.printf("\n\n Enter integer value for element no.%d : ",i+1);
			
			//scanf("%d",&a[i]);
			a[i] = in.nextInt();
		}
		bubble(a,n);
		//printf("\n\n Finally sorted array is: ");
		System.out.println("\n\n Finally sorted array is: ");
		
		for( i=0;i<=n-1;i++)
			//printf("%d ",a[i]);
			System.out.printf("%d",  a[i]);
	} //end main
	
} //END CLASS
