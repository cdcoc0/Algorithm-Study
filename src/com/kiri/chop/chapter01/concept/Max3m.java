package com.kiri.chop.chapter01.concept;

public class Max3m {
	
	//�޼ҵ带 �ۼ��� ���� ���� ���ؼ��� �ִ��� ���� �� �ִ��� Ȯ���ϱ�
	
	static int max3(int a, int b, int c) {
		int max = a;
				
		if(b > max) 
			max = b;
		
		if(c > max)
			max = c;
		
		return max;
	}
	
	public static void main(String[] args) {
		
		System.out.println("max3(3, 2, 1) = " + max3(3, 2, 1));
		System.out.println("max3(3, 2, 2) = " + max3(3, 2, 2));
		System.out.println("max3(3, 1, 2) = " + max3(3, 1, 2));
		System.out.println("max3(2, 3, 1) = " + max3(2, 3, 1));
	}
}
