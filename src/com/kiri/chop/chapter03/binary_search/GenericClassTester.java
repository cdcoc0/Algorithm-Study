package com.kiri.chop.chapter03.binary_search;

public class GenericClassTester {
	
	static class GenericClass<T> {
		private T xyz;
		
		GenericClass(T t) {
			this.xyz = t;
		}
		
		T getXyz() {
			return xyz;
		}
	}
	
	public static void main(String[] args) {
		GenericClass<String> s = new GenericClass<String>("ABC");
		GenericClass<Integer> i = new GenericClass<Integer>(15);
		
		System.out.println(s.getXyz());
		System.out.println(i.getXyz());
	}
}
