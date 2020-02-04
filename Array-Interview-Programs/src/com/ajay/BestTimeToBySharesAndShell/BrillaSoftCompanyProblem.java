package com.ajay.BestTimeToBySharesAndShell;

public class BrillaSoftCompanyProblem {

	public static void main(String[] args) {
		int[] arr = { 7, 1, 5, 3, 6, 4 };
		bestTimeToSell(arr);
	}

	private static void bestTimeToSell(int[] arr) {
		int min = Integer.MAX_VALUE;
		int max = 0;
		for (int i = 0; i < arr.length; i++) {

			//logic to find the min value in the array
			if (arr[i] < min) {
				min = arr[i]; // 7
			}
			//logic to find the max value in the array
			if (arr[i] - min > max) {
				max = arr[i] - min;

			}
		}
		System.out.println(max);
	}

}
