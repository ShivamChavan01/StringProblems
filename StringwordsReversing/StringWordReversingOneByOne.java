 package com.kn.StringwordsReversing;

import java.util.Scanner;

public class StringWordReversingOneByOne {
	
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		String inputString= scan.nextLine();
		
		String inputSplit []= inputString.split(" ");
		for(int i=0;i<inputSplit.length;i++) {
			char [] reversedChar =inputSplit[i].toCharArray();
			
			for(int j=reversedChar.length-1;j>=0;j--) {
				System.out.print(reversedChar[j]);
			}
			System.out.print(" ");
		}
		
		
		scan.close();
		
	}

}
//
// enter the string :shivam r chavan
// output:           mavihs r navahc 
