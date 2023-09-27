package com.kn.cesarcipher;

import java.util.Scanner;

public class CesarCipher {

	public static void main(String[] args) {
	  Scanner scan = new Scanner(System.in);
	  System.out.println("Enter the string ");
	  String  input=scan.nextLine();
	  
	  System.out.println("Enter the integer ");
		  int key=scan.nextInt();
		  
		  
		  cesarCipherDemo CesarCipher=new  cesarCipherDemo();
		  CesarCipher.Cipher(input ,key);
		  
	  

	}

}
