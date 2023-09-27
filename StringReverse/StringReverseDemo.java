package com.kn.StringReverse;

public class StringReverseDemo {
	
	

	public String reverseString(String inputString) {
		
		StringBuffer OutputString=new StringBuffer();
		
		for(int i=inputString.length()-1;i>=0;i--) {
			OutputString.append(inputString.charAt(i));
		}
		     return OutputString.toString();
		
	}
	

}
