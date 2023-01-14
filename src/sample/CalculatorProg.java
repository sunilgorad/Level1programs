package sample;

public class CalculatorProg {
	
	public static void main(String[] args)
	{
		int a=20;
		int b=10;
		CalculatorProg cl=new CalculatorProg();
		System.out.println(cl.add(a,b));
		System.out.println(cl.sub(a,b));
		System.out.println(cl.mul(a,b));
		System.out.println(cl.div(a,b));
	}
public int add(int a, int b)
{
	int sum=a+b;
	return sum;
}
public int sub(int a, int b)
{
	int sub=a-b;
	return sub;
}
public int mul(int a, int b)
{
	int mul=a*b;
	return mul;
}
public int div(int a, int b)
{
	int div=a/b;
	return div;
}
}