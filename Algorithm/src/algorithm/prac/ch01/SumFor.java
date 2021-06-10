package algorithm.prac.ch01;

import java.util.Scanner;

public class SumFor {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("1부터 n까지의 합을 구합니다.");
		System.out.println("n의 값 : ");
		
		int n = scanner.nextInt();
		int sum = 0;
		
		sum = (1 + n) * (n / 2) + (n%2 == 0 ? 0 : (1+n)/2);
		
//		for (int i = 1; i <= n; i++) { sum += i; }
		
		
		System.out.println("1부터 " + n + " 까지의 합은 " + sum + " 입니다.");
		
		System.out.println(sumof(4, 5));
	}
	
	public static int sumof(int a, int b) {
		int result = 0;
		
		if(a < b) {
			for (; a <= b; a++) {
				result += a;
			}
		}
		else if(a > b) {
			for (; b <= a; b++) {
				result += b;
			}
		}
		else result = a + b;
		
		return result;
	}
}
