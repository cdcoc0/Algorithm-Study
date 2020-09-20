package com.kiri.chop.chapter02.array;

import java.util.Scanner;

public class CardConvRevDetail {
	static int cardConvR(int x, int r, char[] d) {
		int digits = 0;
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		System.out.println(r + "|	" + x);
		System.out.println(" +----------");
		//System.out.printf(String.format("%%2d | %%%dd\n", n), r, x);
		
		do {
			d[digits++] = dchar.charAt(x % r);
			x /= r;
			
			if(x > 0) {
			System.out.println(r + "|	" + x + " ... " + d[digits - 1]);
			System.out.println(" +----------");
			}
			
			/*System.out.printf("   +");
			for (int i = 0; i < n + 2; i++)
				System.out.print('-');
			System.out.println();

			if (x / r != 0)
				System.out.printf(String.format("%%2d | %%%dd    �� %%d\n", n), r, x / r, x % r);
			else
				System.out.printf(String.format("     %%%dd    �� %%d\n", n), x / r, x % r);
			d[digits++] = dchar.charAt(x % r); // r�� ���� �������� ����
			x /= r;*/
			
		} while(x != 0);
		
		System.out.println("   	0 ... " + d[digits - 1]);
		
		return digits;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;
		int cd;
		int dg;
		int retry;
		char[] cno = new char[32];
		
		System.out.println("10������ ����� ��ȯ");
		
		do {
			do {
				System.out.println("���� �ƴ� ���� �Է�: ");
				n = stdIn.nextInt();
			} while(n < 0);
			
			do {
				System.out.println("� ������ ��ȯ?(2~36)");
				cd = stdIn.nextInt();
			} while(cd < 2 || cd > 36);
			
			dg = cardConvR(n, cd, cno);
			
			System.out.print(cd + "������ ");
			
			for(int i = dg - 1; i >= 0; i--) {
				System.out.print(cno[i]);
			}
			System.out.println("�Դϴ�.");
			
			System.out.println("�� �� ��? (1.�� / 2.�ƴϿ�)");
			retry = stdIn.nextInt();
		} while(retry == 1);
	}
}
