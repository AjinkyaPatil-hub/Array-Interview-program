package com.ajay.findMaxSumSubArraySizeK;

/*
 * Given an array of positive numbers and a positive number k,
 *  write a code to find maximum sum of any subarray of size k
	{2,1,5,1,3,2}
	{5,1,3}==> 9
 */
public class Solution {

	public static void main(String[] args) {
		int[] arr = { 2, 1, 5, 1, 3, 2 };
		int k = 3;
		maxSmSubArrayByK(arr,k);
	}

	private static void maxSmSubArrayByK(int[] arr,int k) {
		int maxSum=0;
		for (int i = 0; i < arr.length-3; i++) {
			int currentSum= sumOfK(i, arr, k);
			maxSum = Math.max(currentSum, maxSum);
		}
		System.out.println(maxSum);

	}

	private static int sumOfK(int i, int[] arr,int k) {
		int cuurentSum=0;
		
		for(int j=i;j<i+k;j++) {
			cuurentSum = cuurentSum+arr[j];
		}
		return cuurentSum;
	}
}
