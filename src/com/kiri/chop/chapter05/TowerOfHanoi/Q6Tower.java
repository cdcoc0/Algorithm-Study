package com.kiri.chop.chapter05.TowerOfHanoi;

import java.util.Scanner;

public class Q6Tower {
	
	static String[] tower = {"0", "A���", "B���", "C���"};
	
	static void moveAlphabet(int no, int x, int y) {
		
		if(no > 1) {
			moveAlphabet(no - 1, x, 6 - x - y);
		}
		
		System.out.println("����[" + no + "]�� " + tower[x] + "���� " + tower[y] + "������� �ű�");
		
		if(no > 1) {
			moveAlphabet(no - 1, 6 - x - y, y);
		}
		
		/*int z = 0;
		if(no > 1) {
			z = 6 - x - y;
			moveAlphabet(no - 1, x, z);
		}
		
		if(x == 1) {
			System.out.print("����[" + no + "]�� a��տ��� ");
			if(z == 2) {
				System.out.println("b������� �ű�");
			} else {
				System.out.println("c������� �ű�");
			}
		} else if(x == 2) {
			System.out.print("����[" + no + "]�� b��տ��� " );
			if(z == 1) {
				System.out.println("a������� �ű�");
			} else {
				System.out.println("c������� �ű�");
			}
		} else if(x == 3) {
			System.out.print("����[" + no + "]�� c��տ��� ");
			if(z == 1) {
				System.out.println("a������� �ű�");
			} else {
				 System.out.println("b������� �ñ�");
			}
		}
		
		if(no > 1) {
			moveAlphabet(no - 1, 6 - x - y, y);
		}*/
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("Tower of Hanoi");
		System.out.println("���� ����: ");
		int no = stdIn.nextInt();
		
		moveAlphabet(no, 1, 3);
	}
}
