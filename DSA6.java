package Ass;

public class DSA6 {

	public static void main(String[] args) {
		
		int n[]= {1,2,1,3},flag=0;
		for(int i=0;i<n.length;i++)
		{
			for(int j=i+1;j<n.length;j++)
			{
				if(n[i]==n[j])
				{
					flag=1;
					break;
				}
			}
		}
		System.out.println((flag==0)?false:true);
	}
}
