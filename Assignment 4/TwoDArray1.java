package com;
import java.util.*; 
public class TwoDArray1 {

	/**
	 * @param args
	 */
			// TODO Auto-generated method stub
		   public void displayPattern(int [][] TwoDArr) 
		    { 
		        
		        for (int i = 0; i < TwoDArr.length; i++) 
		        { 
                 System.out.println("Length of TwoDArray " + TwoDArr.length);
		            if (i % 2 == 0)
		{ 
		                for (int j = 0; j < TwoDArr[0].length; j++) 
		                    System.out.print(TwoDArr[i][j] +" "); 
		  

		            } 
		           else
		            { 
		                for (int j = TwoDArr[0].length - 1; j >= 0; j--) 
		                    System.out.print(TwoDArr[i][j] +" "); 
		            } 
		        } 
		    	} 
		
		    } 
		
		 

	


