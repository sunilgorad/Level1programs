package sample;

import java.util.Scanner;

public class Oddevencount {
	
	public static void main(String[] args)
	{
		int e=0;
		int o=0;
		System.out.println("Please enter any number:");
		
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		for (int i=1; i<=number; i++)
		{
			if (i%2==0)
			{
				//System.out.println(i +" Even Number");
				e++;
			}
			else
			{
				//System.out.println(i +" Odd number");
				o++;
			}
		}
			System.out.println("Number of even numbers: "+e);
			System.out.println("Number of odd numbers: "+o);
		}
	}


