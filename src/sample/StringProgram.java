package sample;

public class StringProgram {
	
	public static void main(String[] args)
	{
		/*String s = "Testing_X18 ";
		String s1 = "eager to learn java";
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s.concat(s1));
		System.out.println(s+s1);
		*/
		String s="mango";
		String s1="Apple";
		System.out.println(s);
		System.out.println(s1);
		s=s1;
		
		System.out.println(s);
		System.out.println(s1);
		
		if(s=="Apple")
		{
			System.out.println("True");
		}
	}

}
