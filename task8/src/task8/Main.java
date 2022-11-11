package task8;

import java.util.Scanner;


public class Main {
	


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input num: ");
		int num = sc.nextInt();
		
		if (Palindrome(num)) {
			System.out.println("True");
		}
		
		else {
			System.out.println("False");
		}
		
	}
	
	public static boolean Palindrome(int num) {
		int k = num;
		int res = 0;
		while (k > 0)
		{
			int r = k % 10;
			res = res * 10 + r;
			k = k/10;
			
		}
		
		return (num == res);
	}
	
}