package algorithm.prac.ch01;

import java.io.ObjectInputStream.GetField;
import java.util.Scanner;

public class SumForPos {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n1;
		int n2;
		
//		System.out.println("1부터 n까지 합");
//		
//		do {
//			System.out.println("n의 값 : ");
//			n = scanner.nextInt();
//		} while (n <= 0);
//		
//		int sum = 0;
//		
//		for (int i = 1; i <= n; i++) sum += i;
//		
//		System.out.println("1부터 "+ n + " 까지 합 : " +  sum);
		
		// 연습문제 Q10
//		System.out.println("n1 의 값");
//		n1 = scanner.nextInt();
//		do {
//			System.out.println("n2의 값");
//			n2 = scanner.nextInt();
//		} while (n2 < n1);
//		
//		System.out.println(n2 - n1);
		
		//연습 문제 Q11
		System.out.println(getNumLength(135123));
		
	}
	
	public static int getNumLength(int num) {
		return String.valueOf(num).length();
	}
}
