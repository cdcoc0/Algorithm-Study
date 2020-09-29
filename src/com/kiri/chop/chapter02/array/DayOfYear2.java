package com.kiri.chop.chapter02.array;

import java.util.Scanner;

public class DayOfYear2 {
	
	static int[][] mdays = {
			{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
			{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},			
	};
	
	static int isLeap(int year) {
		return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
	}
	
	static int dayOfYear(int y, int m, int d) {
		
		while(--m != 0) { 
			d += mdays[isLeap(y)][m-1];
		}
		return d;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int retry;
		
		System.out.println("�� �� ��� �ϼ� ���ϱ�");
		
		do {
			System.out.print("��: "); int year = stdIn.nextInt();
			System.out.print("��: "); int month = stdIn.nextInt();
			System.out.print("��: "); int day = stdIn.nextInt();
			
			System.out.printf("�� �� %d��°�Դϴ�.", dayOfYear(year, month, day));
			
			System.out.println("�ٽ�?(1.�� / 2.�ƴϿ�)");
			retry = stdIn.nextInt();
		} while(retry == 1);
	}
}
