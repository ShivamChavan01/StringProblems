package com.kn.cesarcipher;

public class cesarCipherDemo {

	public void Cipher(String input, int key) {
	char arr[]=input.toCharArray();
	
	while(key>26)
	{
		
		key-=26;
	}
	for(int i=0;i<arr.length;i++) {
		if(arr[i]>=65 && arr[i]<=90-key ||arr[i]>=97 && arr[i]<=122-key ) {
			arr[i]=(char)((arr[i]+key));
			System.out.print(arr[i]+" ");
			
		}
		else {
			arr[i]=(char)(arr[i]+key-26);
			System.out.print(arr[i]+" ");
		}
		
	}
	
	
	

	
	
	}

}
