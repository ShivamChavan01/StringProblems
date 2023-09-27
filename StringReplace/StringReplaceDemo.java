package com.kn.StringReplace;

import java.util.Scanner;

public class StringReplaceDemo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		 // taking input from String
		 System.out.println("Enter the String =");
		 String InputString=scan.nextLine();
		 
		 
		 //Creating an Object for the input String
		ReplaceString replacestring=new ReplaceString();
		
		 
		 //Calling the method of reversedString
	 String result = replacestring.replacingSpacesFromString(InputString);
	
		 System.out.println(result);
		 
		 //Releasing the resource
		 scan.close();
		
	}

}
