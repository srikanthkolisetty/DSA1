package Ass;

public class DSA8 {
	
	public static void main(String[] args) {
		
		int n[]= {1,2,2,4},n2[];
		for(int i=0;i<n.length;i++)
		{
			for(int j=i+1;j<n.length;j++)
			{
				if(n[i]==n[j])
				{
					n2=new int[] {n[i],n[i]+1};
					for(int k:n2)
					{
						System.out.print(k);
					}
					break;
				}
			}
		}
	}

}
