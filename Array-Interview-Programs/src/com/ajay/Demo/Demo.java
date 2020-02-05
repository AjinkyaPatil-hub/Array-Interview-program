package com.ajay.Demo;

public class Demo {

	public static void main(String[] args) {
		//i cahanged in demo
		
		
		
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
