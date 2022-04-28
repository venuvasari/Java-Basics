package basic_concepts;


import java.util.Scanner;
import java.util.*;

public class Sam {
	public static void main(String [] args)
	{
		Scanner sc= new Scanner(System.in);
		int a[]=new int[12];
		int b[]=new int[12];
		int j, i; int k = 0;
		System.out.println("enter array");

		for (i=0; i<a.length; i++)
		{
			a[i]= sc.nextInt();
		}
		


		Arrays.sort(a);


		System.out.println("Numbers After Restructuring");

		for (j=0; j <b.length; j++)
		{ 

			if(a[j]%2==0)
			{
				b[j]=a[j];
			}
			else
			{
				b[b.length-j]=a[j];
			}
			System.out.print(b[j]+" ");

		}




	}
}
