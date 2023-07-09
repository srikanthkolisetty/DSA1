package Ass;

public class DSA1 {

	public static void main(String[] args) {
		int a[]	= {2,7,11,15};
		int target=9;
		boolean found=false;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]+a[j]==target)
				{
					System.out.println("["+i+","+j+"]");
					found=true;
					break;
				}
			}
		}
				if(found==false)
					System.out.println("not found");
	}
}
