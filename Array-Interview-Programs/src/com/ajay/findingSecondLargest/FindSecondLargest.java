package com.ajay.findingSecondLargest;

import java.util.Arrays;
import java.util.List;

public class FindSecondLargest {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		findSecondLargestElement(list);
	}

	private static void findSecondLargestElement(List<Integer> list) {
		
		int largest =list.get(0);
		int secondLargest = list.get(0);
		
		for(int i=0;i<list.size();i++) {
			if(list.get(i) > largest) {
				secondLargest = largest;
				largest = list.get(i);
			}
		}
		System.out.println("second largest:" + secondLargest);
		
		
	}
}
