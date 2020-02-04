package com.ajay.printDuplicateElemetInArray;

import java.util.HashSet;
import java.util.Set;

/*
 * printing duplicate element int he array
 */
public class PrintingDuplicateElmentInArray {

	public static void main(String[] args) {
		int[] arr= {1,2,4,1,2,5,8,7};
		duplicateEleent(arr);
	}

	private static void duplicateEleent(int[] arr) {
		Set<Integer> set = new HashSet<>();
		for(int i=0;i<arr.length;i++) {
			if(!set.contains(arr[i])) {
				set.add(arr[i]);
			}else {
				System.out.println("{"+arr[i]+"}");
			}
			
		}
		
	}
}
