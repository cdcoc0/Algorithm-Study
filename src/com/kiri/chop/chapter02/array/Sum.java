package com.kiri.chop.chapter02.array;

import java.util.Scanner;

public class Sum {
	static int sumOf(int[] a) {
		
		int sum = 0;
		for(int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("�迭 ����� �� ���ϱ�");
		System.out.println("��ڼ�: ");
		int n = stdIn.nextInt();
		
		int[] x = new int[n];
		
		for(int i = 0; i < n; i++) {
			System.out.println("x[" + i + "]�� ��: ");
			x[i] = stdIn.nextInt();
		}
		
		System.out.println("�迭 ��ҵ��� ��: " + sumOf(x));
	}
}
