package com.kn.Split;
import java.util.Scanner;

public class LargestWordinTheStringSplit {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the String:");
		String inputString=scan.nextLine();
	
		String  [] inputSplit=inputString.split(" ");
		String s1=" ";
		for(int i=1;i<inputSplit.length;i++) {
			
			if(inputSplit[i].length()>s1.length()) {
				s1=inputSplit[i];
				
				
			}
			
		
		}
		System.out.println(s1);
		scan.close();
	}

}
