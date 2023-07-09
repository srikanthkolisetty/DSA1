package Ass;

public class DSA4 {
	
	public static void main(String[] args) {
		
		int remainder,reverse,k=1;
		int a[]= {1,2,4};
		String s="";
		for(int i:a)
		{
			s+=i;
		}
		Integer i1=(Integer.parseInt(s))+1;
		int b[]=new int[i1.toString().length()];
		 while (i1 != 0) {
			    remainder = i1 % 10;
			    b[b.length-k]=remainder;
			    i1 /= 10;
			    k++;
			  }
		for(int i:b)
		{
			System.out.print(i);
		}
	}
}
