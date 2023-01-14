import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		int number;
		int a = 0;
		int b = 1;
		int c;
		System.out.print("Please enter number");
		Scanner sc = new Scanner(System.in);
		number=sc.nextInt();
		for (int i=1; i<= number; i++)
		{
			System.out.println(a+ " ");
			c = a + b;
			a = b;
			b = c;
		}
	}
}
