package com.kiri.chop.chapter02.array;

import java.util.Scanner;

public class ReverseArrayDetail {
	
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	static void reverse(int[] a) {
		
		for(int i = 0; i < a.length / 2; i++) {
			System.out.println("a[" + i + "]��(��) a[" + (a.length - i - 1) +"]�� ��ȯ");
			swap(a, i, a.length - i - 1);
			
			for(int j = 0; j < a.length; j ++) {
				System.out.print(a[j] + " ");
			}
			System.out.println("");
		}
		System.out.println("���� ���� ����");
	}
	
	/*// �迭�� ��� a[idx1]�� a[idx2]�� ��ȯ
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}

	// �迭 a�� ��� ���� ��Ÿ��
	static void print(int[] a) {
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
		System.out.println();
	}

	// �迭 a�� ��Ҹ� �������� ����
	static void reverse(int[] a) {
		print(a);
		for (int i = 0; i < a.length / 2; i++) {
			System.out.println("a[" + i + "]�� a[" + (a.length - i - 1) + "]�� ��ȯ�մϴ�.");
			swap(a, i, a.length - i - 1);
			print(a);
		}
	}*/
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("��ڼ�: ");
		int n = stdIn.nextInt();
		
		int[] x = new int[n];
		
		for(int i = 0; i < x.length; i++) {
			System.out.println("x[" + i + "]: ");
			x[i] = stdIn.nextInt();
		}
		
		reverse(x);
		
		System.out.println("��Ҹ� �������� ����");
		
		for(int i = 0; i < n; i++) {
			System.out.println("x[" +i + "]: " + x[i]);
		}
		
	}
}