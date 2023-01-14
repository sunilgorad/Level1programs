package sample;

public class TestCalc {

	public static void main(String[] args)
	{
		int a=80;
		int b=40;
		
		CalculatorProg cl=new CalculatorProg();
		
		System.out.println(cl.add(a, b));
		System.out.println(cl.sub(a, b));
		
	}
}
