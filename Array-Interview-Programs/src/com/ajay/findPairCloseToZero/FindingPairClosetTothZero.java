package com.ajay.findPairCloseToZero;

/*closet pair to the zero
 *  i/p ={1,8,-1,7,6,-3,2}
 *  o/p= {0 and 6}
 *  i.e {1,-2} ==> 1 close to zero
 */
public class FindingPairClosetTothZero {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 55, -55, 8, 6, -1 };
		closePairToZero(arr);
	}

	private static void closePairToZero(int[] arr) {
		int i = 0;
		int smallestSum = 99999;
		System.out.println("close pair to zero");
		while (i < arr.length) {
			int j = i + 1;
			while (j < arr.length) {
				if (arr[i] + arr[j] != 0) {
					int currentSum = Math.abs(arr[i] + arr[j]);
					if (currentSum < smallestSum) {
						System.out.println("index from: {" + i + "," + j + "}");

					}
					smallestSum = Math.min(currentSum, smallestSum);

				}
				j++;
			}

			i++;
		}
		System.out.println(smallestSum);
	}
}
