package com;

public class LuckyNumber {

	 private boolean diffFlag = true;
    
   //  int i = 0;
     
     public int[] convertToArray (int num)
     {
    	 String s = Integer.toString(num); 

    	 int[] intArray = new int[s.length()]; 


    	 for(int i=0; i<s.length(); i++){
    	     intArray[i] = Character.getNumericValue(s.charAt(i));
    	 }
    	 return intArray;
}
     
     public void checkRepeatedDigit(int[] iArray)
     {
     for (int i=0;i< iArray.length;i++)
     {       
    	 for (int j=i+1; j < iArray.length ;j++)
    	 {
    		 if (iArray[i] == iArray[j])
    		 {	
    			 	diffFlag = false;
    			 	System.out.println("Given Number is not a Lucky Number");
    			 	return;
    		 }
    		else
      
    		diffFlag = true;
    	
    	 }
     }
     if (diffFlag == true)
     {
    	 System.out.println("Given Number is a Lucky Number");
     }
	
	}
}

