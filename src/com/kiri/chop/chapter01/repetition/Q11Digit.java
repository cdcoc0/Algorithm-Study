package com.kiri.chop.chapter01.repetition;

import java.util.Scanner;

public class Q11Digit {
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		int n;
		int sum = 0;
		//�� �Է�
		System.out.println("���� ������ �ڸ����� ���մϴ�.");
		do {
			System.out.println("���� ������ �Է��ϼ���.");
			n = stdIn.nextInt();
		}
		
		while (n <= 0);
		
		//�ڸ��� ���
		//�ڸ�����ŭ 1�� ����
		for(int i = n; i > 0; i /= 10) {
			
			sum += 1;
		}
		System.out.println(n + "�� �ڸ���: " + sum);
		
		//��
		/*
		 * Scanner stdIn = new Scanner(System.in);

		System.out.println("���� �������� �ڸ����� ���մϴ�.");

		int n;
		do {
			System.out.print("��������");
			n = stdIn.nextInt();
		} while (n <= 0);

		int no = 0; 			// �ڸ���
		while (n > 0) {
			n /= 10; 			// n�� 10���� ����
			no++;
		}

		System.out.println("�� ���� " + no + "�ڸ��Դϴ�.");
		 */
	}
}
