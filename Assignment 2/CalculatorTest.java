package com;

public class CalculatorTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calc = new Calculator(1);
		int onoff = calc.getOnOff();
		if (onoff == 1) 
		{
		System.out.println("************Add************");
		calc.basicFunc(1,2,'A');
		calc.basicFunc(1,2,3,'A');
		calc.basicFunc(0.25f,2,'A');
		calc.basicFunc(3,0.25f,'A');
		//Subtraction
		System.out.println("************Substract********");
		calc.basicFunc(5,2,'S');
		calc.basicFunc(1,2,3,'S');
		calc.basicFunc(0.25f,2,'S');
		calc.basicFunc(3,0.25f,'S');
		//Multiply
		System.out.println("************Product********");
		calc.basicFunc(5,2,'P');
		calc.basicFunc(1,2,3,'P');
		calc.basicFunc(0.25f,2,'P');
		calc.basicFunc(3,0.25f,'P');
		System.out.println("************Divide********");
		//Divide
		calc.basicFunc(5,2,'D');
		calc.basicFunc(1,2,3,'D');
		calc.basicFunc(0.25f,2,'D');
		calc.basicFunc(3,0.25f,'D');
	}
		else
			System.out.println("Switch on the Calculator");
	}
		

}
