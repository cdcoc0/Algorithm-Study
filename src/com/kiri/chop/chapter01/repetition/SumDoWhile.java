package com.kiri.chop.chapter01.repetition;

import java.util.Scanner;

public class SumDoWhile {
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		int n;
		
		System.out.println("1���� n������ ��");
		
		do {
			System.out.print("n�� ��: ");
			n = stdIn.nextInt();
			
		} while(n <= 0);
		
		int sum = 0;
		
		for(int i = 1; i <= n; i++) {
			sum += i;
		}
		
		System.out.println("1���� " + n + "������ ���� " + sum + "�Դϴ�.");
	}
}
