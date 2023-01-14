package sample;

public class SumOfArray {

	public static void main(String[] args) {

		int [] a= {13,45,67,2,9,0,56};
		int l=a.length;
		int sum=0;
		for(int i=0; i<l; i++)
		{
			sum=sum+a[i];
		}
System.out.println(sum);
	}

}
