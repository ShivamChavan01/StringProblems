package com.kn.DuplicateCharacterRemoving;

public class DuplicateCharacterRemoving {

	public void repating(String inputString) {

		char a[]=inputString.toCharArray();
		  a=SortingAlgothrim(a);
		 for(int i=0;i<a.length-1;i++) {
			 if(a[i]!=a[i+1]) {
				 System.out.println(a[i]);
				 
			 }
		 }
		
		
	}

	public  char[] SortingAlgothrim(char[] a) {
		
		
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < a.length - 1; j++) {
					if (a[j] > a[j + 1]) {
						char swap = a[j];
						a[j] = a[j + 1];
						a[j + 1] = swap;
					}
				}
			}
			return a; 
		
	}

}
