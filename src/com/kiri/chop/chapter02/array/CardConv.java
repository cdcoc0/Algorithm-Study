package com.kiri.chop.chapter02.array;

import java.util.Scanner;

public class CardConv {
	static int cardConv(int x, int r, char[] d) {
		
		int digits = 0;
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		do {
			d[digits++] = dchar.charAt(x % r);
			x /= r;
			
		} while(x != 0);
		
		for(int i = 0; i < digits / 2; i++) {
			char t = d[i];
			d[i] = d[digits - i - 1];
			d[digits - i - 1] = t;
		}
		
		return digits;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;
		int cd;
		int dg;
		int retry;
		char[] cno = new char[32];
		
		System.out.println("10������ ����� ��ȯ�ؿ�");
		
		do {
			do {
				System.out.println("������ �ƴ� ����: ");
				n = stdIn.nextInt();
			} while(n < 0);
			
			do {
				System.out.println("��ȯ�� ���� �Է�(2~36)");
				cd = stdIn.nextInt();
			} while(cd < 2 || cd > 36);
			
			dg = cardConv(n, cd, cno);
			System.out.print(cd + "�����δ� ");
			
			for(int i = 0; i < dg; i++) {
				System.out.print(cno[i]);
			}
			System.out.println("�Դϴٿ�");
			
			System.out.println("�� �� �� ����? (1.�� / 2.�ƴϿ�)");
			retry = stdIn.nextInt();
		} while(retry == 1);
	}
}
