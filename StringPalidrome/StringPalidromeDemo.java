package com.kn.StringPalidrome;

public class StringPalidromeDemo {

	public boolean isPalidrome(String inputString) {
StringBuffer Output=new StringBuffer();
for(int i=inputString.length()-1;i>=0;i--) {
	Output.append(inputString.charAt(i));
}

if(inputString.equals(Output.toString()))
{
	return true;
}
else {
	return false;
}
		    
	}

}
