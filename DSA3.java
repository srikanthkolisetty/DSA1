package Ass;

import java.util.Scanner;

public class DSA3 {

	public static void main(String[] args) {
		
		int a[]= {1,3,5,6};
		System.out.println("enter the value to be found");
		int val= new Scanner(System.in).nextInt();
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>val)
			{
				System.out.println("if we insert it,it will be in"+i+"position");
				break;
			}
			if(a[i]==val)
				System.out.println("found at"+i);
			break;
				
				
		}
				
				
				}

}
