package com.ajay.printingSubSetOfArray;

import java.util.Arrays;

/*
 * int[] arr={1,2,3}
 * 		o/p = {},{1},{2},{3},{1,2}{1,3}{2,3}{1,2,3}
 */
public class SolutionForPrintingSubSet {

	public static void main(String[] args) {
		int[] arr= {1,2,3};
		printingSubSet(arr);
	}

	private static void printingSubSet(int[] arr) {
		System.out.print("[] ");
		int i=0;
		while(i<arr.length) {
			int j=i+1;
			System.out.print("["+arr[i]+"] ");
			while(j<arr.length) {
				System.out.print("["+arr[i]+","+arr[j]+"]  ");
				j++;
			}
			i++;
		}
		System.out.println(Arrays.toString(arr));
		
	}
}
