package com.kiri.chop.chapter02.array;

import java.util.Scanner;

//�Է� ���� 10������ 2���� ~ 36������ ��ȯ�� ��Ÿ��
public class CardConvRev {
	
	//������ x�� r������ ��ȯ�� �迭 d�� �Ʒ��ڸ����� �־�ΰ� �ڸ��� ��ȯ
	static int cardConvR(int x, int r, char[] d) {
		
		int digits = 0; // ��ȯ ���� �ڸ���
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		do {
			d[digits++] = dchar.charAt(x % r);
			//++�� digits �ڿ� �ֱ� ������ ���� �� digits ����
			x /= r;
		} while (x != 0);
		return digits;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int no; // ��ȯ�ϴ� ����
		int cd; // ���
		int dno; // ��ȯ ���� �ڸ���
		int retry; //�ٽ� �� ��?
		char[] cno = new char[32]; // ��ȯ �� �� �ڸ��� ���ڸ� �־�δ� ������ �迭
		
		System.out.println("10������ ��� ��ȯ");
		do {
			do {
				System.out.println("��ȯ�ϴ� ���� �ƴ� ����");
				no = stdIn.nextInt();
			} while(no < 0);
			
			do {
				System.out.println("� ������ ��ȯ?(2~36)");
				cd = stdIn.nextInt();
			} while(cd < 2 || cd > 36);
			
			dno = cardConvR(no, cd, cno);
			//no�� cd������ ��ȯ
			
			System.out.println(cd + "�����δ� ");
			for(int i = dno - 1; i >= 0; i--) {
				System.out.print(cno[i]);
			}
			System.out.println();
			
			System.out.println("�� ��? (1.�� / 2.�ƴϿ�): ");
			retry = stdIn.nextInt();
		} while(retry == 1);
	}
}