package com.kiri.chop.chapter01.repetition;

import java.util.Scanner;

public class Q10Subtract {
	public static void main(String[] args) {
		
	Scanner stdIn = new Scanner(System.in);
	
	int a;
	int b;
	
	//�� ���� �Է�
	System.out.println("���� b-a�� ����մϴ�.");
	System.out.println("a: ");
	a = stdIn.nextInt();
	System.out.println("b: ");
	b = stdIn.nextInt();
	
	//b > a �Ǵ�
	while(b <= a) {
		System.out.println("a���� ū ���� �Է��ϼ���.");
		System.out.println("b: ");
		b = stdIn.nextInt();
	}
	//��� ����
	System.out.println("b-a = " + (b-a));
	
	/*Scanner stdIn = new Scanner(System.in);

		System.out.print("a�� ����");
		int a = stdIn.nextInt();

		int b=0;
		while (true) {
			System.out.print("b�� ����");
			b = stdIn.nextInt();
			if (b > a)
				break;
			System.out.println("a���� ū ���� �Է��ϼ���!");
		}

		System.out.println("b - a�� " + (b - a) + "�Դϴ�.");*/
	
	}
}
