package com.ajay.firstNonRepeatedElement;

/*
 *  i/p {1,2,3,2,3,1,5}
 	o/p {5}
 */
public class Solution {
	public static void main(String[] args) {
		int[] arr= {1,2,3,2,3,5};
		firstNonRepeatingElement(arr);
		//edited by another developer
		//edited by Suresh developer
		
	}

	private static void firstNonRepeatingElement(int[] arr) {
		
		int i=0;
		while(i<arr.length) {
			int j=0;
			while(j<arr.length) {
				if(i==j) {
					j++;
				}
				else if(arr[i] == arr[j]){
					break;
				}
				else if(j == arr.length-1) {
					
					System.out.println(arr[i]);
				}
				j++;
			}
			i++;
		}
		
			
	}
}
