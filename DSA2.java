package Ass;

public class DSA2 {

	public static void main(String[] args) {
		
	int a[]= {3,2,2,1,3};
	int val=3;
	for(int i:new DSA2().get(a, val))
	{
		System.out.println(i);
	}
	}
	
	public int[] get(int []a,int val)
	{
		int b[]=new int[a.length];
		int k=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=val)
			{
				b[k]=a[i];
				k++;
			}
		}
		
		return b;
	}
}
