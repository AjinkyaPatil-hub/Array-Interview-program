package com.ajay.firstNonRepeatedElement;

import java.util.HashMap;
import java.util.Iterator;

/*
 *  i/p {1,2,3,2,3,1,5}
 	o/p {5}
 */
public class Solution {
	public static void main(String[] args) {
		int[] arr= {1,2,3,2,3,5,5};
		//firstNonRepeatingElement(arr);
		//edited by another developer
		//edited by Suresh developer
		firstNonRepeatingElementUsingHashing(arr);
	}

	private static void firstNonRepeatingElementUsingHashing(int[] arr) {
		HashMap<Integer,Integer> hm = new HashMap<>();
		
		for(int i=0;i<arr.length;i++) {
			if(hm.containsKey(arr[i])) {
				hm.put(arr[i], hm.get(arr[i])+1);
			}else {
				hm.put(arr[i], 1);
			}
		}
		System.out.println(hm); // o/p of hashmap{1=1, 2=2, 3=2, 5=2}
		Iterator<Integer> itr = hm.keySet().iterator();
		Integer key =0;
		while(itr.hasNext()) {
			key = itr.next();
			if(key == 1) {
				//pass key in get method and get the value 
				System.out.println("first nonrepeated value in the array: "+hm.get(key));
			}
		}
		
	}

	private static void firstNonRepeatingElement(int[] arr) {
		
		int i=0;
		while(i<arr.length) {
			int j=0;
			while(j<arr.length) {
				
				if(i!=j && arr[i] == arr[j]){
					break;
				}
				if(j == arr.length-1) {
					
					System.out.println(arr[i]);
				}
				j++;
			}
			i++;
		}
		
			
	}
}
