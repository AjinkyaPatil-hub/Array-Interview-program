package com.ajay.totalNoOfStepsToReachNthStair;

/*
 * Total number of steps/ways to reach nth position 
 * steps {1,2,3}
 * nth = 3
 * ways {1,1,1}{1,2}{2,1}{3}
 * o/p --> is 3 ways
 */

public class CompanyStairsProblem {

	public static void main(String[] args) {
		int[] arr = {1,2,3};
		int pos =4;
		findWays(arr,pos);
	}

	private static void findWays(int[] arr, int pos) {
		int a=1;
		int b=1;
		int c=2;
		int d = 0;
		
		for(int i=3;i<=pos;i++) {
			d =a+b+c;
			a=b;
			b=c;
			c=d;
		}
		System.out.println(c);
	}
}
