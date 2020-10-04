package com.kiri.chop.chapter03.binary_search;

import java.util.Scanner;

public class SeqSearchDetail {
	
	static int seqSearch(int[] a, int n, int key) {
		int i = 0;
		
		System.out.print("	|" );
		for(int j = 0; j < n; j++) {
			System.out.print(" " + j + " ");
		}
		System.out.println();
		System.out.print("----------");
		for(int j = 0; j < n; j++) {
			System.out.print("---");
		}
		System.out.println();
		
		while(true) {
			
			if(i == n)
				return -1;
			
			System.out.print("	|");
			for(int j = 0; j <= i; j++) {
				if(j == i)
					System.out.print(" * ");
				
				System.out.print("   ");
			}
			System.out.println();
			System.out.print(i + "	|");
			for(int j = 0; j < n; j++)  {
				System.out.print(" " + a[j] + " ");
			}
			System.out.println();
			
			if(a[i] == key)
				return i;
			
			i++;
		}
		
		/*System.out.print("   |");
		for (int k = 0; k < n; k++)
			System.out.printf("%4d", k);
		System.out.println();

		System.out.print("---+");
		for (int k = 0; k < 4 * n + 2; k++)
			System.out.print("-");
		System.out.println();

		for (int i = 0; i < n; i++) {
			System.out.print("   |");
			System.out.printf(String.format("%%%ds*\n", (i * 4) + 3), "");
			System.out.printf("%3d|", i);
			for (int k = 0; k < n; k++)
				System.out.printf("%4d", a[k]);
			System.out.println("\n   |");
			if (a[i] == key)
				return i; // �˻�����
		}
		return -1; // �˻�����*/
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("��ڼ�: ");
		int num = stdIn.nextInt();
		int[] x = new int[num];
		
		for(int i = 0; i < num; i++) {
			System.out.print("x[" + i + "]: ");
			x[i] = stdIn.nextInt();
		}
		
		System.out.print("�˻��� ��: ");
		int ky = stdIn.nextInt();
		
		int idx = seqSearch(x, num, ky);
		
		if(idx == -1)
			System.out.println("�� ���� ��Ұ� �����ϴ�.");
		else
			System.out.println(ky + "��(��) x[" + idx + "]�� �ִ�.");
	}
}
