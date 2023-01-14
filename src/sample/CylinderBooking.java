package sample;
import java.util.Scanner;

public class CylinderBooking {

	public static void main(String[] args) {
		
		System.out.println("Please enter your choice number:");
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		
		switch(number)
		{
		case 1: System.out.println("To book the cylinder");
		break;
		case 2: System.out.println("To file complaint");
		break;
		case 3: System.out.println("To talk with customer care");
		break;
		case 4: System.out.println("To know status");
		break;
		default : System.out.println("Please enter valid choice number!!!");
		
		}
		
	}

}
