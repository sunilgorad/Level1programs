package sample;
import java.util.Scanner;

public class Nestedifelse {

	public static void main(String[] args)
	{
		System.out.println("Please enter percentage:");
		Scanner sc=new Scanner(System.in);
		float percentage =sc.nextFloat();
		
		if (percentage>=90)
		{
			System.out.println("You will get Bike");
		}
		else if (percentage>=80)
		{
			System.out.println("You will get Iphone");
		}
		else
		{
			System.out.println("Better luck next time!!!");
		}
		
	}
}
