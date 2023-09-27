package com.kn.UpperCaseLowerCase;

public class UpperCaseLowerCaseCounts {

	public void CharacterCounts(char[] arr) {
		int Lowervowel = 0;
		int LowerCon = 0;
		int Uppervowel = 0;
		int UpperCon = 0;
		int digit = 0;
		int space = 0;
		int SpecialCha = 0;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] >= 65 && arr[i] <= 90) {
				if (arr[i] == 'A' || arr[i] == 'E' || arr[i] == 'I' || arr[i] == 'O' || arr[i] == 'U') {
					Uppervowel++;
				} else {
					UpperCon++;
				}
			}

			// for lower
			else if (arr[i] >= 97 && arr[i] <= 122) {
				if (arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u') {
					Lowervowel++;
				} else {
					LowerCon++;
				}
			}

			// for digit
			else if (arr[i] >= 48 && arr[i] <= 57) {
				digit++;
			}

			else if (arr[i] == 32) {
				space++;
			} else {
				SpecialCha++;
			}

		}
		System.out.println("The count of  each individual characters are =");
		System.out.println("UpperVowel=" + Uppervowel);
		System.out.println("UpperConsonant=" + UpperCon);
		System.out.println("LowerVowel=" + Lowervowel);
		System.out.println("LowerConsonant=" + LowerCon);
		System.out.println("Digits=" + digit);
		System.out.println("SpecialCharacters=" + SpecialCha);
		System.out.println("Space=" + space);

	}

}
