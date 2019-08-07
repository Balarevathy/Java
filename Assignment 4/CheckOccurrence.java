package com;

public class CheckOccurrence {

	/**
	 * @param args
	 */
 
		// TODO Auto-generated method stub
  
  
  static boolean checkOccurence(int N )
  {
	  //int[] freq = new int[10];
	  boolean sameOccur = true;
	  String st = ""+N;
	  int n = st.length();
	  int[] freq = new int[n];
	  int i=0;
	  
	
   for ( i=0;i< n;i++)   
   {
	   System.out.println(st.charAt(i)-'0');
	   System.out.println("Without zero" + st.charAt(i));
	   
	 
	freq [st.charAt(i)-'0']++;
   }
	  
 	 for (i=0; i <n-1;i++)
 	 {
 		
 		 if (freq[i] != freq[i+1])
 		 {
 			sameOccur= false;
 			 			
 		 }
	
 	
	}
   if (sameOccur)
		return true;
		
	else
		return false;
  }
  }
   


