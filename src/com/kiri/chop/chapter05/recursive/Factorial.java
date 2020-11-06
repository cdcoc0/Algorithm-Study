package com.kiri.chop.chapter05.recursive;

import java.util.Scanner;

public class Factorial {
	
	static int factorial(int n) {
		if(n > 0)
			return n * factorial(n - 1); //�ڱ� �ڽ� ȣ��
		else
			return 1;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("���� �Է�: ");
		int x = stdIn.nextInt();
		
		System.out.println(x + "�� ���丮��: " + factorial(x));
	}
}
