package com.kn.cesarcipher;

import java.util.Scanner;

public class Cesar {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
System.out.println("Enter the String");
String name=scan.nextLine();

System.out.println("ENter the key ");
int key =scan.nextInt();

ceasarChipher(name,key);
	}

	static void ceasarChipher(String name, int key) {
char arr[]=name.toCharArray();
while(key>26) {
	key-=26;
}

for(int i=0;i<arr.length;i++) {
	if(arr[i]>=65 && arr[i]<=90-key||arr[i]>=97 && arr[i]<=122-key) {
		arr[i]=(char)(arr[i]+key);
		System.out.print(arr[i]+" ");
	}
	else {
		arr[i]=(char)(arr[i]+key-26);
		System.out.print(arr[i]+" ");
	}
}
		
	}

}
