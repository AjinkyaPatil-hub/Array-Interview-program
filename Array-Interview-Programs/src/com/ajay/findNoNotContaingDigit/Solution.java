package com.ajay.findNoNotContaingDigit;

/*
 * i/p = 149
 * i/p = 4
 * o/p = 139 
 	explaition 
 */
public class Solution {

	public static void main(String[] args) {
		int num = 145;
		int no = 4;
		findNoNotPresentDigit(num, no);
	}

	private static void findNoNotPresentDigit(int num, int no) {
		while (true) {
			boolean flag = findNO(num, no);
			if (flag == true) {
				System.out.println("the number smallest than the given digit is: "+num);
				break;
			} else {
				num--;
			}
		}
	}//nice builder
	//this is for checking that the given number is present 
	//if present it will return false
	//if not it will return true 
	private static boolean findNO(int num, int no) {
		int mod = 0;
		while (num > 0) {
			mod = num % 10;// 9
			if (mod == no) {
				return false;
			}
			num = num / 10;
		}
		return true;
	}
}
