package com;

public class TwoDArray1Class {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int TwoDArr[][] = new int[][] 
		        { 
		            { 11, 22, 33, 44 }, 
		            { 55, 66, 77, 88 }, 
		            { 99, 111, 222, 333 }, 
		            { 444, 555, 666, 777 } 
		        }; 
		TwoDArray1 TwoDArray = new TwoDArray1();
		TwoDArray.displayPattern(TwoDArr);

	}

}
