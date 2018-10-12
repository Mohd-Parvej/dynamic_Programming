package basic;

import java.util.Scanner;

public class uglyNumbers {
	
	private static Scanner sc;
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Enter the value of n:");
		int n = sc.nextInt();
		int count = 1, i;
		for(i=2; ; i++) {
			if(i%2 == 0 || i%3 == 0 || i%5 == 0) {
				count++;
				if(count == n)
					break;
			}
		}
		System.out.println(i);
	}

}
