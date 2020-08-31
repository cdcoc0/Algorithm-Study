package com.kiri.chop.chapter01.repetition;

import java.util.Scanner;

public class Q9SumMethod {
	
	static int sumof(int a, int b) {
		
		int sum = 0;
		
		if(a < b) {
			for(int i = a; i <= b; i++) {
				sum += i;
			}
		
			return sum;
		}
		
		else {
			for(int i = b; i <= a; i++) {
				sum += i;
			}
			return sum;
		}
	}
	
	//���� �ش�
	static int sumof2(int a, int b) {
		int min; // a, b�� ���� ���� ��
		int max; // a, b�� ū ���� ��

		if (a < b) {
			min = a;
			max = b;
		} else {
			min = b;
			max = a;
		}

		int sum = 0; // ��
		for (int i = min; i <= max; i++)
			sum += i;
		return (sum);
	}

	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("a�� b�� �����Ͽ� �� ������ ��� ������ ���� ���մϴ�.");
		System.out.print("a�� ����");
		int a = stdIn.nextInt();
		System.out.print("b�� ����");
		int b = stdIn.nextInt();

		System.out.println("���� a, b ������ ��� ������ ���� " + sumof(a, b) + "�Դϴ�.");
	}
}
