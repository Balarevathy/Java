package com;

import java.util.Scanner;

public class Palindrome2 {
	int cnt = 0;
	 //String palin= "malayalams";
     int rev=0;
     boolean palindrome=true;
    // palin = "malayalams";
     
     
     boolean isPalindrome(String palin)
     {
    	 rev=palin.length()-1;
     System.out.println((palin.length()/2));
     for (int i=0;i<palin.length();i++)
     {
     System.out.println("start :" + palin.charAt(i)+ " " + "Finish :" + palin.charAt(rev));
     
    
     if (palin.charAt(i) != palin.charAt(rev))
   	  palindrome = false;
   
     
     rev--;
  
  
     
	}
     
     if (palindrome)
   	  System.out.println("Given String is a Palindrome");
     else
   	  System.out.println("Given String is not a Palindrome");
     return palindrome;
     }    
     
     public static void main(String[] args) {
    	 Scanner in = new Scanner(System.in);
    	 System.out.println("Enter the String:");
    	 String str = in.next();
    	 System.out.println("str:"+str);
    	 Palindrome2 Palin2 = new Palindrome2();
    	 Palin2.isPalindrome(str);
    	 
    	 
     }
     

}

