package com;

import java.util.HashSet;
import java.util.Set;
// Insertion order is not maintained in HashSet
class HashSetExample {
public static void main(String[] args) {
	Set<Integer> s=new HashSet<Integer>();
	s.add(12);
	s.add(88);
	s.add(88);
//	s.add(12.5);
	s.add(null);
	
	for(Integer o:s) {
		System.out.println(o);
	}
}
}
