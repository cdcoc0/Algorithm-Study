package com.kiri.chop.chapter01.repetition;

import java.util.Scanner;

public class Triangle {
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		int n;
		
		System.out.println("���� �Ʒ��� ������ �̵ �ﰢ�� ���");
		
		do {
			System.out.println("�� �� �ﰢ���Դϱ�?: ");
			n = stdIn.nextInt();
			
		} while(n <= 0);
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
