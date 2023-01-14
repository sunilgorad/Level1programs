package sample;

public class MinNumber {

	public static void main(String[] args) 
	{
		int [] a= {13,45,67,2,9,0,56};
		int l=a.length;
		int min=0;
		for(int i=1; i<l; i++)
		{
			if(min>a[i])
			{
				min=a[i];
			}
		}
System.out.println(min);
	}

}
