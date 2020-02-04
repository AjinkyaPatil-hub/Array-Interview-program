package com.ajay.findMaxDiffBetwTwoElem;

/*
 * Given an array of integers,
 *  find Maximum difference between two elements such that larger number appears after the smaller number.
 *  {2,5,15,6,4}
 *  o/p = 13 {2,15}
 */
public class Solution {

	public static void main(String[] args) {
		int[] arr= {7,9,5,6,13,2};
		findMaxDiff(arr);
	}

	private static void findMaxDiff(int[] arr) {
		int max =0;
		int i=0;
		
		while(i<arr.length-1) {
			//if i < than i+1 them only remove the difference 
			if(arr[i] < arr[i+1]) {
				int j=i+1; 
				while(j<arr.length) {
					//as we go till end we have to check the condition for the rest also
					//so same condition for the j also
					if(arr[i] < arr[j]) {
						//it removes the difference in which j is larger than i
						int temp = arr[j]-arr[i];
						//it updates only that in which temp is greater than max
						if(temp > max) {
							max = temp;
						}
					}
					//this is for j moves to last
					j++;
				}
				//if arr[i]<arr[i+1] gives true then i++;
				i++;
			}
			//if above condition fails then this i++;
			i++;
		}
		System.out.println(max);
	}
	
}
