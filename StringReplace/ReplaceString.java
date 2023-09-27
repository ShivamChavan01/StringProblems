package com.kn.StringReplace;

public class ReplaceString {
	public String replacingSpacesFromString( String InputString) {
		StringBuffer BufferedString = new StringBuffer(InputString);
		for(int i=0;i<InputString.length();i++) {
			if(BufferedString.charAt(i)==' ') {
				BufferedString.setCharAt(i, '#');
				
			}
		}
		return BufferedString.toString();
		
	}

}
