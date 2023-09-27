package com.kn.FirstWord;

import java.util.Scanner;

public class FirstWordUpperClassWitjoutObject {
	public static String StringUpperCase(String inputString) {
		StringBuffer bufferedString = new StringBuffer();
		String[] arr = inputString.split(" ");
		for (int i = 0; i < arr.length; i++) {
			char[] brr = arr[i].toCharArray();
			for (int j = 0; j <= 0; j++) {

				if (brr[j] >= 97 && brr[j] <= 122) {
					brr[j] = (char) (brr[j] - 32);
				}

			}
			for (char a : brr) {
				bufferedString.append(a);
			}
			bufferedString.append(" ");
		}
		return bufferedString.toString();

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String inputString = scan.nextLine();
		String a = StringUpperCase(inputString);
		System.out.println(a);

	}

}
