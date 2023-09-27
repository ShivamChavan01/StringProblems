package com.kn.StringPalidrome;

import java.util.Scanner;

public class isPalidromedemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		 // taking input from String
		 System.out.println("Enter the String =");
		 String InputString=scan.nextLine();
		 
		 
		 //Creating an Object for the input String
		 StringPalidromeDemo reverseString=new StringPalidromeDemo ();
		 //Calling the method of reversedString
		 
		 boolean Output=reverseString.isPalidrome(InputString);
		 if(Output==true) {
			 System.out.println("The String is palindrome  "+ Output);
		 }
		
		 
		 //Releasing the resource
		 scan.close();
	}

}
