package com.ajay.mergeTwoSortedArray;

import java.util.Arrays;

public class Solution {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		int[] arr2 = { 2, 5, 7, 8, 9, 10 };
		merge(arr, arr2);
	}

	private static void merge(int[] arr, int[] arr2) {
		int[] res = new int[arr.length + arr2.length];
		int first = 0;
		int second = 0;
		int i = 0;
	
		while(first<arr.length && second <arr2.length) {
			if(arr[first] <arr2[second]) {
				res[i++] = arr[first++];
			}else {
				//when the elements are equal then else will get executed
				res[i++] = arr2[second++];
			}
		}
		//if both array are not same then remaning elements should be inserted into res[]
		while(first<arr.length) {
			res[i++] = arr[first++];
		}
		while(second<arr2.length) {
			res[i++] = arr2[second++];
		}
		
		System.out.println(Arrays.toString(res));
	}
}
