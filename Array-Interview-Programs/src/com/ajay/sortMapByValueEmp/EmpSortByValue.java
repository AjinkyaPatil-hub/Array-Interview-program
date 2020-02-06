package com.ajay.sortMapByValueEmp;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class EmpSortByValue {

	public static void main(String[] args) {
		HashMap<Integer, Employee> hm = new HashMap<Integer, Employee>();
		hm.put(11, new Employee(11, "ajay", "developer"));
		hm.put(2, new Employee(2, "mukund", "developer"));
		hm.put(3, new Employee(3, "akshay", "banker"));
		
		//sort by value by name
		System.out.println(hm);
		
		//put it into linkedList
		List<Map.Entry<Integer, Employee>> list =new LinkedList<Map.Entry<Integer,Employee>>(hm.entrySet());
		
		//sort linked list by using comparator
		Collections.sort(list,new Comparator<Map.Entry<Integer, Employee>>() {

			@Override
			public int compare(Entry<Integer, Employee> o1, Entry<Integer, Employee> o2) {
				return o1.getValue().getName().compareTo(o2.getValue().getName());
			}
		});
		//put the linked list into map
		HashMap<Integer, Employee> hMap = new LinkedHashMap<Integer, Employee>();
		for(Map.Entry<Integer, Employee> aa:list) {
			hMap.put(aa.getKey(), aa.getValue());
		}
		System.out.println("Sorted HashMap by Name property");
		System.out.println(hMap);
	}
	
}
