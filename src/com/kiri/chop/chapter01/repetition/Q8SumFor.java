package com.kiri.chop.chapter01.repetition;

import java.util.Scanner;

public class Q8SumFor {
	public static void main(String[] args) {
		
		//���콺�� ����
		Scanner stdIn = new Scanner(System.in);
		System.out.println("1���� n���� ������ ��");
		System.out.println("n���� �Է��ϼ���.");
		int n = stdIn.nextInt();
		
		int sum = (n + 1) * (n / 2) + (n % 2 == 1 ? (n + 1) / 2 : 0); // ��
		
	}
}
