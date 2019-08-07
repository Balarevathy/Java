package com;

import java.util.Scanner;

public class CheckOccurenceClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	//int[]  intArray = {0,0,1,2,2,3,3,4,4};
	/*	int len = 0;
		int [] intArray;
	Scanner in = new Scanner(System.in);
	System.out.println("Enter the length of the array ");
    len = in.nextInt();
     intArray = new int[len];
    System.out.println("Enter Array elements ");

    for(int i=0; i<len; i++ ) {
    	intArray[i] = in.nextInt();
    }*/
		int N = 1233456;
	
	//CheckOccurrence chkOccur = new CheckOccurrence();
	boolean flag = CheckOccurrence.checkOccurence( N );
	if (flag) 
	{
		System.out.println("YES");
	}
		else
		{
	System.out.println("NO");
	
	}
	}

}
