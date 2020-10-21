package com.kiri.chop.chapter04.stack;

//int�� ����
public class IntStack {
	private int max; 	//���� �뷮
	private int ptr;	//���� ������
	private int[] stk;	//���� ��ü
	
	
	//���� ó��: ������ ��� ����
	public class EmptyIntStackException extends RuntimeException {
		public EmptyIntStackException() {}
	}
	
	public class OverflowIntStackException extends RuntimeException {
		public OverflowIntStackException() {}
	}
	
	//������
	public IntStack(int capacity) {
		ptr = 0;
		max = capacity;
		try {
			stk = new int[max];
		} catch(OutOfMemoryError e) {
			max = 0;
		}
	}
	
	//Ǫ�� �޼��� push
	public int push(int x) throws OverflowIntStackException {
		if(ptr == max) //ptr�� 0�̻� max�̸�
			throw new OverflowIntStackException();
		return stk[ptr++] = x;
	}
	
	public int pop() throws EmptyIntStackException {
		if(ptr <= 0)
			throw new EmptyIntStackException();
		return stk[--ptr];
	}
	
	public int peek() throws EmptyIntStackException {
		if (ptr <= 0)
			throw new EmptyIntStackException();
		return stk[ptr - 1];
	}
	
	//���ÿ��� x�� ã�� �ε���(������ -1)�� ��ȯ
	public int indexOf(int x) {
		for(int i = ptr - 1; i >= 0; i--) {
			if(stk[i] == x)
				return i;
		}
		return -1;
	}
	
	//������ ���
	public void clear() {
		ptr = 0;
	}
	
	//������ �뷮�� ��ȯ
	public int capacity() {
		return max;
	}
	
	//���ÿ� �׿� �ִ� ������ �� 
	public int size() {
		return ptr;
	}
	
	//������ ��� �ִ°�?
	public boolean IsEmpty() {
		return ptr <= 0;
	}
	
	//������ ���� á�°�?
	public boolean IsFull() {
		return ptr >= max;
	}
	
	//���� ���� ��� �����͸� �ٴ� -> ����� ������ ���
	public void dump() {
		if (ptr <= 0)
			System.out.println("the stack is empty");
		else {
			for(int i = 0; i < ptr; i++) {
				System.out.println(stk[i]);
			}
		}
	}
}
