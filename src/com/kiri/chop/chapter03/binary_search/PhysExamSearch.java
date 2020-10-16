package com.kiri.chop.chapter03.binary_search;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class PhysExamSearch {
	
	//������ ��Ұ��� ��
	static class PhyscData {
		private String name;
		private int height;
		private double vision;
		
		//������
		public PhyscData(String name, int height, double vision) {
			this.name = name;
			this.height = height;
			this.vision = vision;
		}
		
		//���ڿ� ��ȯ �޼���(���� Ȯ�ο�)
		public String toString() {
			return name + " " + height + " " + vision;
		}
		
		//�������� ���� comparator
		public static final Comparator<PhyscData> HEIGHT_ORDER = new HeightOrderComparator();
		
		private static class HeightOrderComparator implements Comparator<PhyscData> {
			public int compare(PhyscData d1, PhyscData d2) {
				return (d1.height > d2.height) ? 1 : 
					(d1.height < d2.height) ? -1 : 0;
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		PhyscData[] x = {
		new PhyscData("a", 162, 0.3),
		new PhyscData("b", 168, 0.4),
		new PhyscData("c", 169, 0.8),
		new PhyscData("d", 171, 1.5),
		new PhyscData("e", 173, 0.7),
		new PhyscData("f", 174, 1.2),
		new PhyscData("g", 175, 2.0)
		};
		
		System.out.println("�� cm�� ����� ã�� ����?");
		int height = stdIn.nextInt();
		int idx = Arrays.binarySearch(x, new PhyscData("", height, 0.0), 
				PhyscData.HEIGHT_ORDER);
		
		if(idx < 0)
			System.out.println("failed");
		else {
			System.out.println("x[" + idx + "]�� �ֽ��ϴ�.");
			System.out.println("ã�� ������: " + x[idx]); //toString �޼��� ��ȯ
		}
	}
}
