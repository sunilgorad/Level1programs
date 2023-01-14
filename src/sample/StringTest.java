package sample;

public class StringTest {
	
	public static void main(String[] args)
	{
		String s="  Play ,Cricket ,and ,earn ,money";
		String s1="Play";
		String[] st=s.split(",");
		System.out.println(st[0].contains(s1));
		//System.out.println(st[0].trim().contains(s1));
	}

}
