package com.kn.UpperCaseLowerCase;

import java.util.Scanner;

public class UpperCaseLowerCase {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the STring ");
		String s1 = scan.nextLine();
		

		char arr[] = s1.toCharArray();

		UpperCaseLowerCaseCounts lowercaseUpperCase = new UpperCaseLowerCaseCounts();
		lowercaseUpperCase.CharacterCounts(arr);

	}

}
