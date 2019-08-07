package com;

import java.util.Scanner;

public class LuckNumberClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] result;
		System.out.print("Please enter the number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(num);
		LuckyNumber chkRep = new LuckyNumber();
		result = chkRep.convertToArray(num);
		chkRep.checkRepeatedDigit(result);

	}

}
