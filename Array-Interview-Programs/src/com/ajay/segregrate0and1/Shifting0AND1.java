package com.ajay.segregrate0and1;

import java.util.Arrays;

/*
 * Write a java program to segregate 0s and 1s in an array.
 *  Write a c program to segregate 0s and 1s in an array. without sorting
 *  i/p={0,1,0,1,0,1,0}
 *  o/p={0,0,0,0,1,1,1}
 */
public class Shifting0AND1 {

	public static void main(String[] args) {
		int[] arr= {0,1,0,1,0,1,0};
		shifting(arr);
		
	}

	private static void shifting(int[] arr) {
		int st =0;
		int lst=arr.length-1;
		while(st<lst) {
			if(arr[st] == 0) {
				st++;
			}
			else if(arr[lst] ==1) {
				lst--;
			}else if(arr[st]==1 && arr[lst] == 0) {
				int temp = arr[st];
				arr[st] = arr[lst];
				arr[lst] = temp;
				st++;
				lst--;
			}
		}
		System.out.println(Arrays.toString(arr));
		
		
		
	}
}
