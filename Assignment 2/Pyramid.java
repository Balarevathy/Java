package com;

import java.util.Scanner;

public class Pyramid {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int n=1;
	int k=0;
	int j ;
	int p;
	
	
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter a number to form a Pyramid");
		n=in.nextInt();
		
		for (int i=1;i<=n;i++)
		{
			p=0;
			//System.out.println("n:"+n);
			for ( j=1; j<=i;j++)
		{
				k=k+1;
				System.out.print(k+" ");
				
				
			}
			n=n-i;
			
			
			System.out.println();
		
		}	
		

	}

}
