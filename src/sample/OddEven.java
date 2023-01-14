package sample;

import java.util.Scanner;
public class OddEven {
	
	public static void main(String[] args)
	{
		System.out.println("Please enter any number: ");
		
		Scanner sc=new Scanner(System.in);
		
		int number=sc.nextInt();
		
		if (number%2==0)
		{
			System.out.println("Its an Even Number");
		}
		else
		{
			System.out.println("Its an ODD number!!!");
		}
			
		
	}

}
