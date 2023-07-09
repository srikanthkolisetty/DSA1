package Ass;

public class DSA7 {

	public static void main(String[] args) {
		
		int p[]= {0,0,1,0,2,0,3,4};

		for(int i=0;i<p.length;i++)
		{
			if(p[i]==0)
			{
				for(int j=i+1;j<p.length;j++)
				{
					if(p[j]!=0)
					{
						p[i]=p[j];
						p[j]=0;
						break;
			}
				}
			}
		}
		for(int i:p)
		{
			System.out.print(i);
		}
	}
}
