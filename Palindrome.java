package Week_1;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		int n, x, y, rem;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number :");
		n = sc.nextInt();
		x = n;
		y = palindromeOrNot(n);
		if (y == x)
			System.out.println(x + " is a palindrome  ");
		else
			System.out.println(x + " is not a palindrome  ");
	}

	static int palindromeOrNot(int num) {
		int sum = 0, rem;
		while (num != 0) {
			rem = num % 10;
			sum = (sum * 10) + rem;
			num /= 10;
		}
		return sum;
	}

}
