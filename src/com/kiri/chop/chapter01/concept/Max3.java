package com.kiri.chop.chapter01.concept;

import java.util.Scanner;

public class Max3 {
	public static void main(String[] args) {
		
		//3���� ������ �� '�ִ�' ���ϱ�
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("�� ������ �ִ��� ���մϴ�");
		System.out.println("a�� ��: ");
		int a = stdIn.nextInt();
		
		System.out.println("b�� ��: ");
		int b = stdIn.nextInt();
		
		System.out.println("c�� ��: ");
		int c = stdIn.nextInt();
		
		int max = a;
		if(b > max) max = b;
		
		if(c > max) max = c;
		
		System.out.println("�ִ��� : " + max + " �Դϴ�.");
	}
}