package com.ajay.findMaxSumSubArray;

/*
 * Given an integer array, 
 * find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
 	{1,2,-5,-2}
 	{1,2} max sum of sub array	
 *
 */
public class MaxSumSubArray {

	public static void main(String[] args) {
		int[] arr= {1,2,-5,4,3,8,5};
		maxSumSubArray(arr);
	}

	private static void maxSumSubArray(int[] arr) {
		int maxSum=arr[0];
		int sum =arr[0];
		
		for(int i=1;i<arr.length;i++) {
			if(sum < 0) {
				sum = arr[i];
			}else {
				sum = sum+arr[i];
			}
			maxSum = Math.max(sum, maxSum);
		}
		System.out.println(maxSum);
		
		
	}
}
