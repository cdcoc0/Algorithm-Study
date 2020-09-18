package com.kiri.chop.chapter02.array;

import java.util.Scanner;

public class ArrayCopy {
	
	static void copy(int[] a, int[] b) {
		
		int n = a.length <= b.length ? a.length : b.length;
		
		for(int i = 0; i < n; i++) {
			a[i] = b[i];
		}
	}
	
	
	//a�� b���� ��ڼ��� ���� ��� �޺κ��� �׳� ���д�.
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("�迭 a�� ��ڼ�: ");
		int na = stdIn.nextInt();
		int[] a = new int[na];
		
		for(int i = 0; i < na; i++) {
			System.out.println("a[" + i + "]: ");
			a[i] = stdIn.nextInt();
		}
		
		System.out.println("�迭 b�� ��ڼ�: ");
		int nb = stdIn.nextInt();
		int[] b = new int[nb];
		
		for(int i = 0; i < nb; i++) {
			System.out.println("b[" + i + "]: ");
			b[i] = stdIn.nextInt();
		}
		
		System.out.println("�迭 b�� �迭 a�� ���纹��");
		copy(a, b);
		
		for(int i = 0; i < na; i++) {
			System.out.println("a[" + i + "]: " + a[i]);
		}
	}
}
