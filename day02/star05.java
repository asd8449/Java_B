package day02;

public class star05 {

	public static void main(String[] args) {
		int num = 5;
		int j;
		for (int i = 1; i <= num; i++) {
			for (j = i; j < num; j++) {
				System.out.print(" ");
			}
			for (j = 0; j < i * 2 - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
