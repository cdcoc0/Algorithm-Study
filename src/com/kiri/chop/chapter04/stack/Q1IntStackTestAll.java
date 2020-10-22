package com.kiri.chop.chapter04.stack;

import java.util.Scanner;

public class Q1IntStackTestAll {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		IntStack s = new IntStack(64);
		
		while(true) {
			System.out.println("���� ������ ��: " + s.size() + " / " + s.capacity());
			System.out.println("(1)Ǫ�� (2)�� (3)��ũ (4)���� (5)�˻� (6)��ü ���� (7)isEmpty (8)isFull");
			int menu = stdIn.nextInt();
			
			int x;
			boolean b;
			switch(menu) {
			case 1:
				System.out.println("������: ");
				x = stdIn.nextInt();
				try {
					s.push(x);
				} catch(IntStack.OverflowIntStackException e) {
					System.out.println("������ ���� á���ϴ�.");
				}
				break;
			
			case 2:
				try {
					x = s.pop();
					System.out.println("���� �����ʹ� " + x + "�Դϴ�.");
				} catch(IntStack.EmptyIntStackException e) {
					System.out.println("������ ��� �ֽ��ϴ�.");
				}
				break;
				
			case 3:
				try {
					x = s.peek();
					System.out.println("��ũ �����ʹ� " + x + "�Դϴ�.");
				} catch(IntStack.EmptyIntStackException e) {
					System.out.println("������ ��� �ֽ��ϴ�.");
				}
				break;
				
			case 4:
				s.dump();
				break;
				
			case 5:
				System.out.println("�˻��� ��: ");
				int n = stdIn.nextInt();
				x = s.indexOf(n);
				if(x == -1)
					System.out.println("�ش� ���� �������� �ʽ��ϴ�.");
				System.out.println(n + "��(��) " + (x + 1) + "��°�� �ֽ��ϴ�.");
				break;
				
			case 6:
				s.clear();
				System.out.println("��� �����Ͱ� �����Ǿ����ϴ�.");
				break;
				
			case 7:
				b = s.IsEmpty();
				if(b == true)
					System.out.println("������ ����ֽ��ϴ�.");
				System.out.println("������ ������� �ʽ��ϴ�.");
				break;
				
			case 8:
				b = s.IsFull();
				if(b == true)
					System.out.println("������ ���� �� �ֽ��ϴ�.");
				System.out.println("������ ���� �� ���� �ʽ��ϴ�.");
			}
		}
	}
}
