import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		int a;
		int b;
		int c;
		System.out.println("Enter two numbers: ");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=a+b;
		System.out.println("Addition is :" +c);
		

	}

}
