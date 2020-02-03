package com.ajay.shiftingZeroAtFirst;

import java.util.Arrays;

/*
 * 	shift zero with the same position of the all elements
 		i/p {1,0,5,0,6,7};
 		o/p {0,0,1,5,6,7}
 */		
public class ShiftingZeroAtFirst {
	public static void main(String[] args) {

		int[] arr= {1,0,5,0,6,7};
		shiftZero(arr);	
	}

	private static void shiftZero(int[] arr) {
		int[] zero =new int[arr.length];
		int[] nonZero = new int[arr.length];
		
		int i=0;
		int j=0;
		int k=0;
		int cnt =0;
		while(i<arr.length) {
			if(arr[i] == 0) {
				 zero[j++] = arr[i++] ;
				 cnt++;
			}else {
				nonZero[k++] = arr[i++] ;
			}
		}
		System.out.println(Arrays.toString(zero));
		System.out.println(Arrays.toString(nonZero));
		
		int a=0;
		for( a=0 ;a<zero.length;a++) {
			arr[a] = zero[a];
		}
		for(int z=0;z<nonZero.length;z++) {
			if(nonZero[z] == 0) {
				break;
			}
			arr[cnt++] = nonZero[z]; 
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("My changes...!");
		
	}
}
