package day02;

public class star02 {

	public static void main(String[] args) {
		int num = 5;
		
		for(int i = 0;i < num; i++) {
			for(int j = 0;j < num - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
