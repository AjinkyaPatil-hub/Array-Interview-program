package com.ajay.rearrangeElement;

import java.util.Arrays;

/*
 * first negative and then positive 
 *  i/p {1,-8,6,-7,-6,-2,44,55,15}
 *  o/p {-8,1,-7,6,-6,44,-2,55,15}
 */
public class Solution {

	public static void main(String[] args) {
		int[] arr = { 1, -8, 6, -7, -6, -2, 44, 55, 15,99,666};
		rearrangeElements(arr);
	}

	private static void rearrangeElements(int[] arr) {
		int[] negArr = new int[arr.length];
		int[] posArr = new int[arr.length];
		int j=0;
		int k=0;
		int posCnt =0,negCnt=0;
		
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] < 0) // condition for negative element
			{
				negArr[j++] = arr[i]; //negArr = {-8,-7,-6,-2,0,0,0,0,0}
				negCnt++;
			} else  //for positive
			{
				posArr[k++] = arr[i]; //posArr = {1,6,44,55,15,0,0,0,0}
				posCnt++;
			}
		}
		System.out.println("negative arr: "+Arrays.toString(negArr));
		System.out.println("postive arr: "+Arrays.toString(posArr));
		System.out.println("pos cnt:"+posCnt);
		System.out.println("neg cnt:"+negCnt);
		
		//adding to array int result array 
		//first negArr  and then posArr
	
		int itr=0;
		int p=0,n=0;
		while(itr<arr.length) {
			
			if(n != negCnt) {
				arr[itr] = negArr[n++];
				itr++;
			}
			if(p != posCnt) {
				arr[itr] = posArr[p++];
				itr++;
			}
		}
		System.out.println("final ans: " +Arrays.toString(arr));
	}
	
	
}
