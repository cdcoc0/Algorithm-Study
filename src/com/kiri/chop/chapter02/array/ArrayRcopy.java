package com.kiri.chop.chapter02.array;

import java.util.Scanner;

public class ArrayRcopy {
	static void rcopy(int[] a, int[] b) {
		int n = a.length <= b.length ? a.length : b.length;
		
		for(int i = 0; i < n; i++) {
			a[i] = b[n - i - 1];
		}
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("a��ڼ�: ");
		int na = stdIn.nextInt();
		
		int[] a = new int[na];
		for(int i = 0; i < na; i++) {
			System.out.println("a[" + i + "]: ");
			a[i] = stdIn.nextInt();
		}
		
		System.out.println("b��ڼ�: ");
		int nb = stdIn.nextInt();
		
		int[] b = new int[nb];
		for(int i = 0; i < nb; i++) {
			System.out.println("b[" + i + "]: ");
			b[i] = stdIn.nextInt();
		}
		
		System.out.println("�迭 b�� ��Ҹ� �迭 a�� �������� ����");
		rcopy(a, b);
		
		for(int i = 0; i < na; i++) {
			System.out.println("a[" + i + "]: " + a[i]);
		}
	}
}
