package sample;

import java.util.Scanner;

public class Table {
	
	public static void main(String[] args)
	{
		System.out.println("Please provide number:");
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		
		System.out.println("Table for given number is:");
		
		for(int i=1; i<=10; i++)
		{
		int seq=number*i;
		System.out.println(seq);
		}		
		
	}

}
