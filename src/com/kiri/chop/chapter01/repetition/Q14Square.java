package com.kiri.chop.chapter01.repetition;

import java.util.Scanner;

public class Q14Square {
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		System.out.println("�簢���� ����մϴ�.");
		System.out.println("�� ��: ");
		int n = stdIn.nextInt();
		
		for(int i = 1; i <= n; i++)	{
			for(int j = 1; j <= n; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}
