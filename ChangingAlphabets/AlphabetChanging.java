package com.kn.ChangingAlphabets;

public class AlphabetChanging {

	public String  changingAlphbet(String inputString) {
		char [] charArray=inputString.toCharArray();
		
		//method for LOWERCASE 
		 for(int i=0;i<charArray.length;i++) {
			 if(charArray[i]>=65 && charArray[i]<=90) {
				 charArray[i]=(char)(charArray[i]+32);
			 }
			 //METHOD FOR UPPERCASE
			 else if(charArray[i]>=97&& charArray[i]<=122) {
				 charArray[i]=(char)(charArray[i]-32);
			 }
		 }
		 StringBuffer bufferedString= new StringBuffer();
		 for(char c:charArray) {
			 bufferedString.append(c);
		 }
		 System.out.println();
		return bufferedString.toString();
		 
		
		 
		
		
		
	}

}
