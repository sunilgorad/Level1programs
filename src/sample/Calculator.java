package sample;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
	System.out.println("Please enter two numbers:");
	
	Scanner sc=new Scanner(System.in);
	
	int a= sc.nextInt();
	int b= sc.nextInt();
	
	int sum=a+b;
	int sub=a-b;
	int mul=a*b;
	int div=a/b;
	
	System.out.println(sum);
	System.out.println(sub);
	System.out.println(mul);
	System.out.println(div);
	
		
		

	}

}
