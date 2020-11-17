package com.kiri.chop.chapter04.queue;

import java.util.Scanner;

public class IntQueueTester {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		IntQueue s = new IntQueue(64);
		
		while(true) {
			System.out.println("���� ������ ��: " + s.size() + " / " + s.capacity());
			System.out.println("(1)��ť (2)��ť (3)��ũ (4)���� (0)����");
			
			int menu = stdIn.nextInt();
			if(menu == 0)
				break;
			
			int x;
			switch(menu) {
			case 1:
				System.out.println("������: ");
				x = stdIn.nextInt();
				
				try {
					s.enque(x);
				} catch(IntQueue.OverflowIntQueueException e) {
					System.out.println("the queue is full");
				}
			break;	
			
			case 2:
				try {
					x = s.deque();
					System.out.println("��ť ������: " + x);
				} catch(IntQueue.EmptyIntQueueException e) {
					System.out.println("the queue is empty");
				}
			break;
			
			case 3:
				try {
					x = s.peek();
					System.out.println("��ũ�� ������: " + x);
				} catch(IntQueue.EmptyIntQueueException e) {
					System.out.println("the queue is empty");
				}
			break;
			
			case 4:
				s.dump();
				break;
			}
		}
	}
}