package com.kn.ArrayCountIndividual;

import java.util.Scanner;

public class SingleCharacterCount {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		String s1=scan.nextLine();
		char []a=s1.toCharArray();
		SingleCharacterCountinstrings singleCharacter=new SingleCharacterCountinstrings();
		singleCharacter.SingleCharacter(a);
	}

}
