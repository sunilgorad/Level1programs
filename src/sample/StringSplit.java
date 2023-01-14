package sample;

public class StringSplit {
	
	public static void main(String[] args)
	{
		String sentence="Hello team, Welcome to class";
		String[] s=sentence.split(",");
		for (int i=0; i<s.length; i++)
		{
			System.out.println(s[i]);
		}
	}

}
