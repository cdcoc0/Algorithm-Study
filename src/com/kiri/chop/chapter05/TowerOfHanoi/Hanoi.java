package com.kiri.chop.chapter05.TowerOfHanoi;

import java.util.Scanner;

public class Hanoi {
	//no���� ������ x�� ��տ��� y�� ������� �ű�
	
	static void move(int no, int x, int y) {
		if(no > 1)
			move(no - 1, x, 6 - x - y);
		
		System.out.println(
				"���� [" + no + "]�� " + x + "�⵿���� " + y + "������� �ű�"
				);
		
		if(no > 1)
			move(no - 1, 6 - x - y, y);
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("�ϳ����� ž");
		System.out.println("���� ����: ");
		int no = stdIn.nextInt();
		
		move(no, 1, 3);
	}
}
