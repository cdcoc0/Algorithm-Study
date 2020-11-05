package com.kiri.chop.chapter04.queue;

import java.util.Scanner;

public class LastNElements {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		final int N = 10;
		int[] a = new int[N];
		int cnt = 0;
		int retry;
		
		System.out.println("���� �Է�");
		do {
			System.out.printf("%d��° ����: ", cnt + 1);
			a[cnt++ % N] = stdIn.nextInt();
			
			System.out.println("retry? (y.1 / n.0): ");
			retry = stdIn.nextInt();
		} while(retry == 1);
		
		int i = cnt - N;
		if(i < 0)
			i = 0;
		
		for(; i < cnt; i++) {
			System.out.printf("%2d��° ���� = %d", i + 1, a[i % N]);
		}
	}
}
