package com.ajay.sortMapByValue;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SortByValueMap {

	public static void main(String[] args) {
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		hm.put(1, 500);hm.put(2, 10);hm.put(3, 100);
		System.out.println(hm);
		sortByValue(hm);
	}

	private static void sortByValue(HashMap<Integer, Integer> hm) {
		//create a LinkedList for the elements of the map
		List<Map.Entry<Integer, Integer>> list = new  LinkedList<Map.Entry<Integer,Integer>>(hm.entrySet());
		
		//sort the Linked List by using comparator
		Collections.sort(list , new Comparator<Map.Entry<Integer, Integer>>() {

			@Override
			public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {

				return o1.getValue()-o2.getValue();
			}
		});
		System.out.println(list);
		//put data from sorted list into hashMap
		HashMap<Integer, Integer> hmap = new LinkedHashMap<>();
		
		for(Map.Entry<Integer, Integer> aa : list) {
			hmap.put(aa.getKey(), aa.getValue());
		}
		System.out.println("sorted by value");
		System.out.println(hmap);
	}
}
