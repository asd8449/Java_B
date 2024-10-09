package day02;

public class star06 {

	public static void main(String[] args) {
		int num = 5;
		int j;
		for (int i = 0; i < num; i++) {
			for (j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (j = 0; j < (num - i) * 2 - 1 ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
