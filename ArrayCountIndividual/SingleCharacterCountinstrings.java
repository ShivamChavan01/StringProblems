package com.kn.ArrayCountIndividual;

public class SingleCharacterCountinstrings 
{

	public void SingleCharacter(char[] a) 
	{
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length - 1; j++) {
				if (a[j] > a[j + 1]) {
					char swap = a[j];
					a[j] = a[j + 1];
					a[j + 1] = swap;
				}
			}
		} 
		for(char f : a) {
			
			System.out.print(f+" ");
		}
		
		// for Counting the array 
		System.out.println();
            int count=1;
		
			for(int i=0;i<a.length-1;i++) {
				if(i+1==a.length-1) {
					if(a[i]==a[i+1]) {
						count++;
						System.out.println(a[i]+" = "+count);
					}
					else {
						System.out.println(a[i+1]+" = "+1);
						count=1;
					}
					
				}
				if(a[i]==a[i+1]) {
					count++;
					
				}
				else {
					System.out.println(a[i]+" = "+count);
					count=1;
				}
			}
		}
		
		
	
}
