package com.kn.ReplaceMultipleString;

import java.util.Scanner;

public class ReplaceMultipleSpaces {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		//Taking a input from String
		System.out.println("Enter the name");
		String  inputString=scan.nextLine();
		
		//creating a object 
		 ReplaceMultipleString ReplaceString=new ReplaceMultipleString();
		 ReplaceString.ReplacingMultipleMethods(inputString);
	}

}
