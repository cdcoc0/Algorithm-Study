package com.kiri.chop.chapter02.array;

import java.util.Scanner;

//���� �Է� �޾� �迭 ����� �ִ��� ���Ѵ�.

public class MaxOfArray {
	
	static int maxOf(int[] a) {
		
		int max = a[0];
		for(int i = 1; i < a.length; i++) {
			if(a[i] > max)
				max = a[i];
		}
		return max;
	}
	
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("Ű�� �ִ� ���ϱ�");
		System.out.print("��� ��: ");
		int num = stdIn.nextInt();
		
		int[] height = new int[num];
		
		for(int i = 0; i < num; i++) {
			System.out.println("Ű��?");
			height[i] = stdIn.nextInt();
		}
		
		System.out.println("Ű �ִ�: " + maxOf(height));
	}
}
