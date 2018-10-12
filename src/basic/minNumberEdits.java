package basic;

import java.util.Scanner;

public class minNumberEdits {

	private static Scanner sc;
	
	static int edit_Distance(String s1, String s2) {
		int m = s1.length();
		int n = s2.length();
		return 0;
	}
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		System.out.println(edit_Distance(str1, str2));
	}
}
