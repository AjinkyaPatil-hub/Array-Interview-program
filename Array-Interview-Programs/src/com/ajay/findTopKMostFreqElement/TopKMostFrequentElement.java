package com.ajay.findTopKMostFreqElement;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/*
 * Given a non-empty array of integers, find the top k most frequent elements.
 *  In this tutorial, I have explained the algorithm and it's java code to find top k frequent elements.
	{1,1,1,2,2,3,3,3,3}
	{1,2}
	repeated 1=3 times
	3=4 times 
 */
public class TopKMostFrequentElement {

	public static void main(String[] args) {
		int[] arr= {1,1,1,2,2,3,3,3,3};
		findTopK(arr);
	}

	private static void findTopK(int[] arr) {
		int maxFreq =0;
		HashMap<Integer, Integer> hm = new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			//get occurance of current elelemt and 1 to it
			int freq = hm.getOrDefault(arr[i], 0)+1;
			//put the element and its freq in the map
			hm.put(arr[i], freq);
			//keep the track of max occurence
			maxFreq = Math.max(maxFreq, freq);
		}
		//create a list of bucket
		List<Integer>[] list= new List[maxFreq+1];
		
		
		System.out.println(hm);
		
	}
}
