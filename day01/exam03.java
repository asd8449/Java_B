package day01;

import java.util.Scanner;

public class exam03 {
	final static double PI = 3.14;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("원의 반지름을 입력하세요(cm) : ");
		double a = sc.nextDouble();
		System.out.printf("원의 넓이는 %.2fcm입니다.", a * a * PI);
	}
}
