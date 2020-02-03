package com.ajay.sumEqualToGivenNo;

/*	int sum = 20;
 *  i/p {5,8,11,9,12,28,-8}
 *  o/p {11,9}{12,8}{28,-8}
 */
public class Solution {

	public static void main(String[] args) {
		int[] arr={5,8,11,9,12,28,-8};
		int sum=20;
		sumEqualToGivenSum(arr,sum);
	}

	private static void sumEqualToGivenSum(int[] arr,int sum) {
		int i=0;
		while(i<arr.length) {
			int j=i+1; // this will ensure that there are not same elements 
			while(j<arr.length) {
				if(arr[i]+arr[j] == sum) {
					System.out.println("{"+arr[i]+","+arr[j]+"}");
				}
				j++;
			}
			i++;
		}
	}
}
