package com.kn.FirstWord;

public class FirstWord {

	public String UpperCaseFirstWord(String InputString) {

		
		String [] arr=InputString.split(" ");
		StringBuffer BufferedString = new StringBuffer();
		for(int i=0;i<arr.length;i++) {
			char c[]= arr[i].toCharArray();
			for(int j=0;j<=0;j++) {
				if(  c[j]>=97 && c[j]<=122) {
					c[j]=(char)(c[j]-32);
				}
				
				
			}
			for(char a:c) {
				BufferedString.append(a);
				
			}
			BufferedString.append(" ");
			
		
		}
		return BufferedString.toString();
		
		
	}

}
