package com.kiri.chop.chapter01.repetition;

import java.util.Scanner;

public class SumWhile {
	public static void main(String[] args) {
		
		//1���� n������ ���� �� ���ϱ�
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("1���� n������ ��");
		System.out.println("n���� �Է��ϼ���.");
		int n = stdIn.nextInt();
		
		int sum = 0;
		int i = 1;
		
		while(i <= n) {
			sum += i;
			i++;
		}
		
		System.out.println("1���� " + n + "������ ���� " + sum + "�Դϴ�.");
	}
}
