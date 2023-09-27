package com.kn.Anagram;

public class AnagramCheckingDemo {

	public void isAnagram(String s1, String s2) {

		if (s1.length() == s2.length()) {

			char[] crr1 = s1.toCharArray();
			char[] crr2 = s2.toCharArray();

			crr1 = CharSorting(crr1);
			crr2 = CharSorting(crr2);

			boolean isAnagram = false;
			for (int i = 0; i < crr1.length; i++) {
				if (crr1[i] == crr2[i]) {
					isAnagram = true;
				} else {
					isAnagram = false;
				}
			}
			if (isAnagram) {
				System.out.println("ANAGRAM");
			} else {
				System.out.println("NOT ANAGRAM");
			}

		} else {
			System.out.println("These String lenght are not same");
		}

	}

	public char[] CharSorting(char[] crr) {

		for (int i = 0; i < crr.length; i++) {
			for (int j = 0; j < crr.length - 1; j++) {
				if (crr[j] > crr[j + 1]) {
					char swap = crr[j];
					crr[j] = crr[j + 1];
					crr[j + 1] = swap;
				}
			}
		}
		return crr;

	}

}
