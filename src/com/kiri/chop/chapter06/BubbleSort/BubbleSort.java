package com.kiri.chop.chapter06.BubbleSort;

import java.util.Scanner;

public class BubbleSort {
	
	//a[idx1]�� a[idx2]�� ���� �ٲ۴�.
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	//���� ����
	static void bubbleSort(int[] a, int n) {
		for(int i = 0; i < n - 1; i++) {
			for(int j = n - 1; j > i; j--) {
				if(a[j] < a[j - 1])
					swap(a, j, j - 1);
			}
		}
	}
	
	public static void main(String args[]) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("���� ����(����1)");
		System.out.println("��ڼ�: ");
		int an = stdIn.nextInt();
		int[] a = new int[an];
		
		for(int i = 0; i < an; i++) {
			System.out.print("x[" + i + "]: ");
			a[i] = stdIn.nextInt();
		}
		
		bubbleSort(a, an); //�迭 x�� ��������
		
		System.out.println("�������� ����");
		for(int i = 0; i < an; i++) {
			System.out.println("x[" + i + "] = " + a[i]);
		}
	}
}
