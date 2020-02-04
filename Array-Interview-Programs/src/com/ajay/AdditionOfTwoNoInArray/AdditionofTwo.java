package com.ajay.AdditionOfTwoNoInArray;

/*
 *  i/p ={1,2,3,3,2,7}
 *  a+b==c+d
 *  o/p={2,3}{3,2}
 */
public class AdditionofTwo {

	public static void main(String[] args) {
		int[] arr= {3,4,7,1,2,9,8};
		twoAdd(arr);
	}

	private static void twoAdd(int[] arr) {
		int i=0;
		int j =arr.length-1;
		while(i<j) {
			int s = i+1;
			int l = j-1;
			while(s<j) {
				if(arr[i]+arr[s] == arr[j]+arr[l]) {
					System.out.println("{"+arr[i]+""+arr[s]+"}"+"{"+arr[j]+""+arr[l]+"}");
				}
				s++;
				l--;
			}
			i++;
			j--;
		}
	}
}
