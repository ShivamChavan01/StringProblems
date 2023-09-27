package com.kn.DuplicateCharacterRemoving;

import java.util.Scanner;

public class DuplicateCharacter {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String.");
		
		String inputString=scan.nextLine();
		
		DuplicateCharacterRemoving nonRepating =new  DuplicateCharacterRemoving();
		nonRepating.repating(inputString);
		scan.close();
		
		
		

	}

}
