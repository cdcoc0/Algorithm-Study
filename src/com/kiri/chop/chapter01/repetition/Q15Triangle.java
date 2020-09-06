package com.kiri.chop.chapter01.repetition;

public class Q15Triangle {
	static void triangleLB(int a) {
		
		//int a��ŭ ���� �� ����
		//int a��ŭ ���� ����
		for(int i = 1; i <= a; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	//���� ���� ������ �̵ �ﰢ��
	static void triangleLU(int n) {
		
		//int n��ŭ ����
		//int n���� ���� ����
		for(int i = 1; i <= n; i++) {
			for(int j = n; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	/*static void triangleLU(int n) {
		for (int i = 1; i <= n; i++) { 				// i�� (i = 1, 2, �� ,n)
			for (int j = 1; j <= n - i + 1; j++) 	// n-i+1���� '*'�� ��Ÿ��
				System.out.print('*');
			System.out.println(); 					// ����(�ٺ�ȯ)
		}
	}*/
	
	//������ ���� ������ �̵ �ﰢ��
	static void triangleRU(int n) {
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n; j++) {
				if(j < i)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println();
		}
	}
	/*static void triangleRU(int n) {
		for (int i = 1; i <= n; i++) { 				// i�� (i = 1, 2, �� ,n)
			for (int j = 1; j <= i - 1; j++) 		// i-1���� ' '�� ��Ÿ��
				System.out.print(' ');
			for (int j = 1; j <= n - i + 1; j++) 	// n-i+1���� '*'�� ��Ÿ��
				System.out.print('*');
			System.out.println();					// ����(�ٺ�ȯ)
		}
	}*/
	
	//������ �Ʒ��� ������ �̵ �ﰢ��
	static void triangleRB(int n) {
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n-i; j++) {
				System.out.print(" ");
			}
			
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
	
	
	public static void main(String[] args) {
		triangleLB(6);
		triangleLU(8);
		triangleRU(5);
		triangleRB(7);
	}
}
