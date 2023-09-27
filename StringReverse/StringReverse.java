package com.kn.StringReverse;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
 Scanner scan = new Scanner(System.in);
 // taking input from String
 System.out.print("Enter the String =");
 String InputString=scan.nextLine();
 
 
 //Creating an Object for the input String
 StringReverseDemo reverseString=new StringReverseDemo ();
 //Calling the method of reversedString
 String Output=reverseString.reverseString(InputString);
 System.out.println("The reversed string of 1st method :"+Output);
 System.out.println();
 
 //creating another object for different method
 StringReverseDemoMethod2 reverseStringMethod2=new StringReverseDemoMethod2();
 String Output2= reverseStringMethod2.reverseStringMedhod2Class(InputString);
System.out.println("The reversed string of 2nd method :"+Output2);
 
 
 
 //Releasing the resource
 scan.close();
 
 
 
		
		
	}

}
