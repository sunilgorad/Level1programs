package sample;

public class MaxNumber {

	public static void main(String[] args) {
		
		int [] a= {13,45,67,2,9,0,56};
		int l=a.length;
		int max=0;
		for(int i=1; i<l; i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
		}
System.out.println(max);
	}

}
