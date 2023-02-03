package Week_1;

import java.util.Scanner;

public class ReverseNum {

	public static void main(String[] args) {
		int num, rev;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		num = sc.nextInt();
		rev = 0;

		while (num != 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		System.out.println("Reverse of the number is :" + rev);
	}
}
