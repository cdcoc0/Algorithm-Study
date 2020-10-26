package com.kiri.chop.chapter04.queue;

public class IntQueue {
	private int max; // ť�� �뷮
	private int front; // ù ��° ��� Ŀ��
	private int rear; //������ ��� Ŀ��
	private int num; //���� ������ ��
	private int[] que;
	
	//���� �� ����: ť�� ��� ����
	public class EmptyIntQueueException extends RuntimeException {
		public EmptyIntQueueException() {}
	}
	
	//���� �� ����: ť�� ���� ��
	public class OverflowIntQueueException extends RuntimeException {
		public OverflowIntQueueException() {}
	}
	
	//������
	public IntQueue(int capacity) {
		num = front = rear = 0;
		max = capacity;
		try {
			que = new int[max];
		} catch(OutOfMemoryError e) {
			max = 0;
		}
	}
	
	
}
