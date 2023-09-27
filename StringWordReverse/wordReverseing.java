package com.kn.StringWordReverse;

public class wordReverseing {

	public void  StringWordsreversing(String inputString) {
		char[]arr=inputString.toCharArray();
		char[]brr=new char[arr.length];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==' ') {
				brr[i]=' ';
			}
		}
		
		int j=brr.length-1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=' ') {
				if(brr[j]==' ') {
					
					j--;
				}
				brr[j]=arr[i];
				j--;
			}
		}
		new String(brr);
		System.out.println(brr);
			 
		
		
			
		
		
		
	}

}
