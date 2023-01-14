package sample;

public class CardBlock {

	public static void main(String[] args)
	{
		for(int i=1; i<=4; i++)
		{
			if (i<=3)
			{
				System.out.println("Please enter your PIN");
			}
			else
			{
				System.out.println("Your card is blocked!!");
			}
		}
	}
}
