package com.kiri.chop.chapter01.repetition;

import java.util.Scanner;

public class Q7SumFor {
	public static void main(String[] args) {
		
		//1���� n���� ������ ���� ���ϴ� �˰����� �����, ��� ������ ��� ����ϵ��� �ڵ� �ۼ�
		
		Scanner stdIn = new Scanner(System.in);
		System.out.println("1���� n���� ������ ��");
		System.out.println("n���� �Է��ϼ���.");
		int n = stdIn.nextInt();
		
		int sum = 0;
		
		for(int i = 1; n >= i; i++) {
			for(i = 1; n > i; i++) {
				System.out.print(i + "+");
			}
			System.out.print(i);

			sum += i;
		}
		System.out.println(" = " + sum);
		
		
		//���� �ش�
		n = stdIn.nextInt();

		sum = 0; // ��

		for (int i = 1; i <= n; i++) {
			if(i < n)
				System.out.print(i + " + ");
			else
				System.out.print(i);
			sum += i; // sum�� i�� ����
		}
		System.out.println(" = " + sum);
	}
}
