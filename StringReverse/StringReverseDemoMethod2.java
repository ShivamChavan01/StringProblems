package com.kn.StringReverse;

public class StringReverseDemoMethod2 {

	public String reverseStringMedhod2Class(String inputString) {
		char []crr= inputString.toCharArray();
		String rev=" ";
		for(int i=crr.length-1;i>=0;i--) {
			rev+=crr[i];
			
		}
		return rev;
		

		
	}

}
