package com.kiri.chop.chapter05.recursive;

import java.util.Scanner;

public class Euclid {
	
	static int gcd(int x, int y) {
		if(y == 0)
			return x;
		else
			return gcd(y, x % y);
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("�� ������ �ִ����� ���ϱ�");
		System.out.println("���� x: "); int x = stdIn.nextInt();
		System.out.println("���� y: "); int y = stdIn.nextInt();
		
		System.out.println("x, y�� �ִ�����: " + gcd(x, y));
	}
}
