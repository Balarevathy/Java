package com;

public class TestNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int N=2;
		// TODO Auto-generated method stub
		 if ( N < 1 || N > 100)
	        {
	            System.out.println("Range is between 1 and 100 positive integer");
	            return;
	        }
	     
	        if (N%2 == 0)
	        {
	          if (N >= 2 && N <= 5 )
	          {
	              System.out.println("Not Weird");
	          }
	          else if (N >= 6 && N <= 20 )
	          {
	              System.out.println("Weird");
	          }
	          else if (N > 20 )
	          {
	           System.out.println("Not Weird");
	          }

	           } 
	         else
	         {
	         System.out.println("Weird");
	         }

	}

}
