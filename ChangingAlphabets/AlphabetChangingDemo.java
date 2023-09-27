package com.kn.ChangingAlphabets;

import java.util.Scanner;

public class AlphabetChangingDemo {

	public static void main(String[] args) {
 Scanner scan = new Scanner(System.in);
 
 //Taking the String Input
 System.out.print("Enter the String: ");
 String InputString =scan.nextLine();
 
 //Creating an Object for the method 
 AlphabetChanging alphabetChanging= new AlphabetChanging();
  String  result= alphabetChanging.changingAlphbet(InputString); 
  
		 System.out.println(result);
		 scan.close();
	 }
 
 
		
		
		
		
	}


