package com.kn.FirstWord;

import java.util.Scanner;

public class FIrstWordUpperCase {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		 
		 //Taking the String Input
		 System.out.print("Enter the String: ");
		 String InputString =scan.nextLine();
		 
		 //Creating an Object for the method 
		 FirstWord firstword=new FirstWord();
		String result= firstword.UpperCaseFirstWord(InputString);
		
		
		System.out.println(result);
scan.close();
	}

}
