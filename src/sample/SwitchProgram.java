package sample;
import java.util.Scanner;

public class SwitchProgram {
	
	public static void main(String[] args)
	{
		System.out.println("Please enter your choice number:");
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
				
		switch(number)
		{
			case 1: System.out.println("Sim card info");
			break;
			case 2: System.out.println("Sim card loss");
			break;
			case 3: System.out.println("Billing information");
			break;
			case 4: System.out.println("To talk to customer care");
			break;
			default : System.out.println("Please enter valid choice number!!!");
		}
						
	}
}

