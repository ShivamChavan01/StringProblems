package com.kn.Anagram;

import java.util.Scanner;

public class AnagramChecking {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string 1");
		String s1 = scan.nextLine();
		System.out.println("Enter the string 2");
		String s2 = scan.nextLine();

		AnagramCheckingDemo checkingAnagram = new AnagramCheckingDemo();
		checkingAnagram.isAnagram(s1, s2);
	}

}
