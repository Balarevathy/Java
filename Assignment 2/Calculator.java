package com;

public class Calculator {
	int result;
	float resultf;
	private int onOff;
	  Calculator (int onOffFlag )
	 {
		 onOff=onOffFlag;
		 
	 };

	 
	 public int getOnOff() {
		return onOff;
	}


	public void setOnOff(int onOff) {
		this.onOff = onOff;
	}


	public void basicFunc (int a , int b , char func )
	 {
		 switch (func)
		 {
		 case 'A' : 
			 result = a+b;
			 break;
		 case 'S' :
			 result = a-b;
			 break;
		 case 'P' : 
			 result = a*b;
			 break;
		 case 'D' :
			 result = a/b;
			 break;
		default: 
			System.out.println ( "Invalid Input");
		 };
		 
		 
		System.out.println ( "Result: " + result); 
	 };
	 
	 public void basicFunc (int a , int b,int c,char func)
	 {
		 switch (func)
		 {
		 case 'A' : 
			 result = a+ b + c;
			 break;
		 case 'S' :
			 result = a-b-c;
			 break;
		 case 'P' : 
			 result = a*b*c;
			 break;
		 case 'D' :
			 result = a/b/c;
			 break;
		 default: 
				System.out.println ( "Invalid Input");
		 };
		 
		System.out.println ( "Result: " + result); 
	 };
	 
	 public void basicFunc (float a , int b,char func)
	 {
		 switch (func)
		 {
		 case 'A' : 
			 resultf = a+b;
			 break;
		 case 'S' :
			 resultf = a-b;
			 break;
		 case 'P' : 
			 resultf = a*b;
			 break;
		 case 'D' :
			 resultf = a/b;	
			 break;
		 default: 
				System.out.println ( "Invalid Input");
		 };
		 
			System.out.println ( "Result: " + resultf); 
	 };
	 
	 public void basicFunc (int a , float b,char func)
	 {
		 switch (func)
		 {
		 case 'A' : 
			 resultf = a+b;
			 break;
		 case 'S' :
			 resultf = a-b;
			 break;
		 case 'P' : 
			 resultf = a*b;
			 break;
		 case 'D' :
			 resultf = a/b;	
			 break;
		 default: 
				System.out.println ( "Invalid Input");
		 };
		 
		System.out.println ( "Result: " + resultf); 
	 };
	 

	
	 
	 public void on ()
	 {};
	 
	 public void off ()
	 {};

}
