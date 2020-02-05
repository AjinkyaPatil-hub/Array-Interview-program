package com.ajay.findSubArrayWhoseSumIsZero;

/*
 *  i/p ={1,2,3,-1,-2,5}
 *  o/p = index 2 to 4 
 *  return true;
 */
public class SolutionSumZero {

	public static void main(String[] args) {
		int[] arr= {1,2,3,-1,-2,5,1,-1};
		findingSumArrayZero(arr);	
	}
	private static void findingSumArrayZero(int[] arr) {
		int i=0;
		
		while(i<arr.length) {
			int j=i+1;
			int sum=0;
			while(j<arr.length) {
				sum = sum+arr[j];
				if(arr[i]+sum == 0) {
					//System.out.println("index "+i+" to :"+j);
					System.out.println("all elements whose addition is zero: ");
					for(int z=i;z<=j;z++) {
						System.out.print(arr[z]);
					}
					System.out.println();
				}
			j++;
				
			}
			i++;
		}
		
	}
}
