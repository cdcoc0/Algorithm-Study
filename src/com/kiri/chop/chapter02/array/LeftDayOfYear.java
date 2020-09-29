package com.kiri.chop.chapter02.array;

import java.util.Scanner;

public class LeftDayOfYear {
	
	static int[][] mdays = {
			{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
			{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},			
	};
	
	static int isLeap(int year) {
		return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
	}
	
	static int leftDayOfYear(int y, int m, int d) {
		//m���� �ش� �� �ϼ����� ����
		int day = mdays[isLeap(y)][m-1] - d;
		
		for(int i = m; i <= 12; i++) {
			day += mdays[isLeap(y)][m];
		}
		
		/*int days = d; // �ϼ�

		for (int i = 1; i < m; i++) // 1��~(m-1)���� �� ���� ����
			days += mdays[isLeap(y)][i - 1];
		return 365 + isLeap(y) - days;*/
		
		return day;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int retry;
		
		System.out.println("�� ���� ���� �� �� ���ϱ�");
		
		do {
			System.out.print("��: "); int year = stdIn.nextInt();
			System.out.print("��: "); int month = stdIn.nextInt();
			System.out.print("��: "); int day = stdIn.nextInt();
			
			System.out.printf("���� �ϼ�: %d\n", leftDayOfYear(year, month, day));
			
			System.out.println("��? (1.�� / 2.�ƴϿ�)");
			retry = stdIn.nextInt();
		} while(retry == 1);
	}
}
